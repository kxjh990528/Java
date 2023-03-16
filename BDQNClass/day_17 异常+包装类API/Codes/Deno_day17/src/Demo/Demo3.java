package Demo;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/5 11:09
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo3 {
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
        System.out.println("结果是:"+res);
    }
}

