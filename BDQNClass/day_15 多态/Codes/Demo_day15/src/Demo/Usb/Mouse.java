package Demo.Usb;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 10:25
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Mouse extends Usb{
    public Mouse() {
    }

    @Override
    public void work() {
        System.out.println("光标正在移动。。。");
    }
}
