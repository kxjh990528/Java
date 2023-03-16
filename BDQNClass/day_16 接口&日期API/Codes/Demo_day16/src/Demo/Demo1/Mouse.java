package Demo.Demo1;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/3 9:49
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Mouse implements Usb{
    public Mouse() {
    }

    @Override
    public void work() {
        System.out.println("光标正在移动...");
    }
}
