package Homework.ProductManager;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/7 16:11
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Product {
    private int id;    //编号
    private String name;    //名称
    private  float price;   //单价
    private int count;  //数量

    public Product() {
    }

    public Product(int id, String name, float price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "商品信息：{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
