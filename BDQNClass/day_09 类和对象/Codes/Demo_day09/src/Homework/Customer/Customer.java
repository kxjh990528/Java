package Homework.Customer;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/20 9:37
 * @Java version: 1.8.0_361
 * @Description:客户类
 * 属性：积分，卡类型
 * 方法show():显示客户信息（显示积分、卡类型）
 */
public class Customer {
    public int point;  //积分
    public String card_type;   //卡类型
    public void show(){
        System.out.println("积分：" + point + " 卡类型：" +card_type);
    }
}
