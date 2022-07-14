import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * PACKAGE_NAME
 *
 * @author UIMO
 * DATE 2022/7/14
 */
public class TestMain {

    public static void main(String[] args) {
        /*
         * 问题 (1)
         * */
        //  苹果
        Fruit apple = new Fruit("苹果", new BigDecimal(8));
        //  草莓
        Fruit strawberry = new Fruit("草莓", new BigDecimal(13));

        List<Goods> shoppingCart = new ArrayList<>();

        Goods appleGoods = new Goods(apple, 5);
        Goods strawberryGoods = new Goods(strawberry, 5);
        //  购物车添加苹果及数量
        shoppingCart.add(appleGoods);
        //  购物车添加草莓及数量
        shoppingCart.add(strawberryGoods);

        BigDecimal sum01 = Checkout(shoppingCart);
        System.out.println("问题 (1) : " + sum01);

        /*
         * 问题 (2)
         * */
        //  芒果
        Fruit mango = new Fruit("芒果", new BigDecimal(20));
        Goods mangoGoods = new Goods(mango, 5);
        //  购物车添加芒果及数量
        shoppingCart.add(mangoGoods);

        BigDecimal sum02 = Checkout(shoppingCart);
        System.out.println("问题 (2) : " + sum02);

        /*
         * 问题 （3）
         * */
        //  草莓打八折
        strawberry.discount(8);

        BigDecimal sum03 = Checkout(shoppingCart);
        System.out.println("问题 (3) : " + sum03);

        /*
         * 问题 （4）
         * */
        //  打折
        BigDecimal sum04 = Checkout(shoppingCart, new BigDecimal(100), new BigDecimal(10));
        System.out.println("问题 (4) : " + sum04);

    }

    /**
     * 价钱计算
     *
     * @param shoppingCart 货物列表
     */
    public static BigDecimal Checkout(List<Goods> shoppingCart) {
        BigDecimal sum = new BigDecimal(0);
        for (Goods goods : shoppingCart) {
            //  水果斤数
            Integer count = goods.getCount();
            //  水果类型价格
            BigDecimal price = goods.getFruit().getPrice();
            //  运算
            BigDecimal multiplyPrice = price.multiply(new BigDecimal(count));
            //  单个水果合计价钱
            sum = sum.add(multiplyPrice);
        }
        return sum;
    }

    /**
     * 打折用
     *
     * @param shoppingCart 货物列表
     * @param fullLine     满减线
     * @param reduceMoney  减钱
     */
    public static BigDecimal Checkout(List<Goods> shoppingCart, BigDecimal fullLine, BigDecimal reduceMoney) {

        BigDecimal sum = Checkout(shoppingCart);

        //  大于 0 表示 sum 大于 满减线
        if (sum.compareTo(fullLine) >= 0) {
            sum = sum.subtract(reduceMoney);
        }
        return sum;
    }

}

