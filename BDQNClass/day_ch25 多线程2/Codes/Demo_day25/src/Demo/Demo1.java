package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/16 17:32
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo1 {
    public static void main(String[] args) {
        MyThreadAtom atom = new MyThreadAtom();

        for (int i = 0; i < 3; i++) {
            //每次循环都开启一条线程
            new Thread(atom).start();
        }
    }
}
