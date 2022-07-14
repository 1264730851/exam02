/**
 * PACKAGE_NAME
 *
 * @author UIMO
 * DATE 2022/7/14
 * 货物
 */
public class Goods {

    /**
     * 水果数量
     * */
    private final Fruit fruit;

    /**
     * 购买数量
     * */
    private final Integer count;

    public Fruit getFruit() {
        return fruit;
    }

    public Integer getCount() {
        return count;
    }

    public Goods(Fruit fruit, Integer count) {
        this.fruit = fruit;
        this.count = count;
    }



}
