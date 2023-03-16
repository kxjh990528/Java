package Homework;

import Demo.Demo4;
import org.apache.log4j.Logger;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/3 15:17
 * @Java version: 1.8.0_361
 * @Description:作业四:扩展在作业三的基础上将错误信息记录到日志文件中(使用log4j)
 */
public class ArrayIndexOutWithLog4j {
    static Logger logger=Logger.getLogger(ArrayIndexOutWithLog4j.class);
    public static void main(String[] args) {
        try {
            int []a = new int[]{1, 2, 3, 4, 5};
            for (int i = 0; i < 6; i++) {
                System.out.println(a[i]);
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            //2.使用log4j记录异常信息
            logger.info(exception.getMessage());  //记录常规信息，如关键步骤
            logger.error("错误信息");  //表示严重错误
        }
    }
}
