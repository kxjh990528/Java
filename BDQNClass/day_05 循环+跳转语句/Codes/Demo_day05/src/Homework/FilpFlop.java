package Homework;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/14 15:09
 * @Description:作业三:开发一个标题为“FlipFlop”的游戏应用程序。
 * 它从1计数到100，遇到3的倍数就输出单词“Flip”，遇到5的倍数就输出单词“Flop”，
 * 既为3的倍数又为5的倍数则输出单词“FlipFlop”，其余情况下输出当前数字。
 */
public class FilpFlop {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FlipFlop: " + i);
            }else if (i % 3 == 0){
                System.out.println("Flip: " + i);
            }else if (i % 5 == 0) {
                System.out.println("Flop: " + i);
            }else {
                System.out.println(i);
            }
        }
    }
}
