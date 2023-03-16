package Homework.Customer;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/20 9:41
 * @Java version: 1.8.0_361
 * @Description:客户积分回馈
 * 金卡客户积分大于1000分或普卡客户积分大于5000，
 */
public class Point_Feedback {
    public static void feedback(Customer customer) {
        if (customer.card_type.equals("金卡")){
            if (customer.point > 1000) {
                System.out.println("回馈积分500分！");
            }else{
                System.out.println("无回馈积分！");
            }
        }

        if (customer.card_type.equals("普卡")) {
            if (customer.point > 5000) {
                System.out.println("回馈积分500分！");
            }else {
                System.out.println("无回馈积分！");
            }
        }

    }

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.point = 3050;
        customer1.card_type = "金卡";
        customer1.show();
        feedback(customer1);

        Customer customer2 = new Customer();
        customer2.point = 5050;
        customer2.card_type = "普卡";
        customer2.show();
        feedback(customer2);

        Customer customer3 = new Customer();
        customer3.point = 550;
        customer3.card_type = "金卡";
        customer3.show();
        feedback(customer3);

        Customer customer4 = new Customer();
        customer4.point = 4050;
        customer4.card_type = "普卡";
        customer4.show();
        feedback(customer4);
    }
}
