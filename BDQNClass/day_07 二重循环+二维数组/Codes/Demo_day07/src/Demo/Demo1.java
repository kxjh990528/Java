package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/17 10:44
 * @Description:理解二重循环
 */
public class Demo1 {
    public static void main(String[] args) {
        //理解二重循环
        for (int i = 1; i <= 2; i++) {   //外层循环
            for (int j = 1; j <= 3; j++) {   //内层循环
                System.out.println("小王" + i + " " + j);
                break;
                //continue;
            }
        }
    }
}
