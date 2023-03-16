package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/23 11:00
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class MathTools {
    public String name;
    public double length;
    public double width;
    public  void  output(){
        //输出自己的名字十次
        for (int i = 0; i < 10 ; i++) {
            System.out.println(this.name + " * " + (i + 1));
        }
    }

    public double getRecgtangle(double length,double width){
        double c =(length + width) * 2;
        return c;
    }

    public int getSum(int /*arys[]*/ [] arys){
        int sum = 0;
        for (int i = 0; i < arys.length; i++) {
            sum = sum + arys[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* System.out.print("请输入姓名：");
        MathTools mathTools = new MathTools();
        mathTools.name = input.next();
        System.out.println("输出效果如下：");
        mathTools.output();*/

        MathTools mathTools = new MathTools();
        /*System.out.print("情输入长：");
        mathTools.length = input.nextDouble();
        System.out.print("请输入宽：");
        mathTools.width = input.nextDouble();
        System.out.println("周长：" + mathTools.getRecgtangle(mathTools.length, mathTools.width));*/
        int [] mt = new int[]{1, 2, 3, 4};
        int sum = mathTools.getSum(mt);
        System.out.println(sum);
    }
}
