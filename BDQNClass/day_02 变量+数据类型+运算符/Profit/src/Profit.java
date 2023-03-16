import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/12 11:33
 */
public class Profit {
    public static void main(String[] args) {
        double principal;  //本金
        double interest_rate;   //年利率
        double interest;    //利率

        System.out.println("请输入本金数目：");
        Scanner input = new Scanner(System.in);
        principal = input.nextDouble();
        System.out.println("存期一年的本息合计为：" + (principal + (principal * 0.225 * 1)));
        System.out.println("存期两年的本息合计为：" + (principal + (principal * 0.27 * 2)));
        System.out.println("存期三年的本息合计为：" + (principal + (principal * 0.324 * 3)));
        System.out.println("存期五年的本息合计为：" + (principal + (principal * 0.36 * 5)));
    }
}
