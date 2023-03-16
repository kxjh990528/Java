package Demo;

import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/3 14:39
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo4 {
    //1.创建日志记录对象
    static Logger logger=Logger.getLogger(Demo4.class);
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
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            //2.使用log4j记录异常信息
            logger.info(ex.getMessage());  //记录常规信息，如关键步骤
            logger.debug("错误信息");  //理解为异常
            logger.error("错误信息");  //表示严重错误
            logger.warn("错误信息");   //表示警告
        }
        //输出结果
        System.out.println("商是:"+res);
    }
}
