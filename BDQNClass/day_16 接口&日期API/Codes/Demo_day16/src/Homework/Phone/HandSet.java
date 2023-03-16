package Homework.Phone;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/2 16:32
 * @Java version: 1.8.0_361
 * @Description:NULL
 */

//手持设备类
public class HandSet {
    private String brand;   //手持设备品牌
    private String type;    //手持设备类型

    public HandSet() {
        System.out.println("Constructing a handset...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void sendInfo(){
        System.out.println("信息发送中...");
    }

    public void call(){
        System.out.println("呼叫中....");
    }

    public void info(){
        System.out.println("关于本机");
        System.out.println("品牌：" + this.getBrand());
        System.out.println("类型：" + this.getType());
    }
}
