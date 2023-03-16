package Demo;

import java.util.Arrays;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/20 16:26
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class test {
    public static void main(String[] args) {
        //输出以下管理员信息:
        // 用户名:admin密码:123
        // 用户名:wjb密码:456
        Administrator administrator1 = new Administrator();
        Administrator administrator2 = new Administrator();

        administrator1.username = "admin";
        administrator2.password = "123";
        administrator1.show();

        administrator2.username = "wjb";
        administrator2.password = "456";
        administrator2.show();
    }
}
