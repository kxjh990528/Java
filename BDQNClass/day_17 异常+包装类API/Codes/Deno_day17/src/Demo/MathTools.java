package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/3 10:41
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class MathTools {
    /*//求商的方法
    public void seekQuotient() throws Exception{
        Scanner scanner = new Scanner(System.in);
        double res = 0;
        //try{
            System.out.println("请输入被除数：");
            double dividend = scanner.nextDouble();
            System.out.println("请输入除数：");
            double divisor = scanner.nextDouble();

            if (divisor == 5){
                throw new Exception("除数不能为5 /by five");
            }
            res = dividend / divisor;
        *//*}catch (){

        }finally {

        }*//*
        System.out.println("结果：" + res);
    }

    public static void main(String[] args) {
        //调用方法
        MathTools mathTools = new MathTools();

        try {
            mathTools.seekQuotient();  //调用者处理异常
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("继续");
    }*/

    //编写方法求商  三、	使用throws声明方法抛出的异常,调给调用者处理???
    public void cal() throws Exception{
        int res=0;
        //try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int one = scanner.nextInt();
        System.out.println("请输入第二个数:");
        int two = scanner.nextInt();
        //求商
        res = one / two;
        ///}catch (Exception e){
        //     System.out.println("出错啦!"+e.getMessage());
        // }
        //结果
       /* 在上机练习三:
        在上机练习一上优化，当除数为5时， 手动抛出异常
        //手动抛出错误
        if(two==5){
            throw new Exception(“错误消息”);  //抛出自定义，异常对象
            // throw new FiveException();  //抛出自定义，异常对象
        }*/

        //手动抛出错误
        if(two==5){
            throw new Exception("/ divided by 5");  //抛出自定义，异常对象
            // throw new FiveException();  //抛出自定义，异常对象
        }

        System.out.println("结果是:" + res);
    }

    public static void main(String[] args) {
        MathTools mathTools = new MathTools();
        try {
            mathTools.cal();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Execution finished.");
    }
}

