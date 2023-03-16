package Demo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/5 10:23
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo2 {
    public static void main(String[] args) {
        //求商
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        try{
            //可能出错的代码
            System.out.println("请输入的被除数:");
            int one = scanner.nextInt();
            System.out.println("请输入的除数:");
            int two = scanner.nextInt(); //  new Exception();
            //求商
            res=one / two;   //出错以后程序中断运行
        }catch(ArithmeticException e){
            //System.out.println(ex.getMessage());
            e.printStackTrace();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("继续执行...");
        }
        //输出结果
        System.out.println("商是:"+res);
    }
}
