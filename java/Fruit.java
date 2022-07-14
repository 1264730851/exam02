import java.math.BigDecimal;

/**
 * PACKAGE_NAME
 *
 * @author UIMO
 * DATE 2022/7/14
 * 水果
 */
public class Fruit {

    /**
     * 水果名称
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 打折
     */
    public void discount(int discountedNumber) {
        this.price = price.multiply(BigDecimal.valueOf((double) discountedNumber / 10));
        System.out.println(name + "打折后的价格为 ： " + price);
    }

    public Fruit(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
