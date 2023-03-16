/**
 * @Author: 林宇扬
 * @Date: 2023/2/12 11:25
 */
public class Exchange {
    public static void main(String[] args) {
        String left = "黑桃10";
        String right = "红桃8";
        String tmp;
        System.out.println("交换前左手为"+ left + "，右手为" + right);
        tmp = right;
        right = left;
        left = tmp;
        System.out.println("交换后左手为"+ left + "，右手为" + right);
    }
}
