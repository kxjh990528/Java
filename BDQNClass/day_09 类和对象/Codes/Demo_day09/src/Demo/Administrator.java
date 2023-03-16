package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/21 11:27
 * @Java version: 1.8.0_361
 * @Description:要求:使用面向对象实现信息的输出1.定义管理员类Administrator
 *定义两个属性username用户名、password密码定义一个方法显示管理的信息show
 *2.在主函数中创建两个管理员对象，分别赋值显示信息
 */
public class Administrator {
    public String username; //用户名
    public String password; //密码

    public void show(){
        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);
    }
}
