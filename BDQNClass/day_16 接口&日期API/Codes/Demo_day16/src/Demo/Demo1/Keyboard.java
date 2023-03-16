package Demo.Demo1;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/3 9:50
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
//键盘类
public class Keyboard implements Usb{
    public Keyboard() {
    }

    @Override
    public void work() {
        System.out.println("键盘正在输入...");
    }
}
