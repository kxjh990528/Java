package PalindromicNumber;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/19 17:27
 * @Description:给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 * @Java version: 1.8.0_361
 */
public class PalindromicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数字：");
        int x = input.nextInt();
        System.out.println(isPalindrome(x));
    }
    /*
    public boolean isPalindrome(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;
    }
     */

        /*// 定义一个函数，判断一个整数是否是回文数
    public static boolean isPalindrome(int x) {
      // 如果x是负数或者能被10整除（除了0），则不可能是回文数
      if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
      }
      // 定义一个变量，用来存储x的后半部分反转后的值
      int reversed = 0;
      // 循环条件：当x大于reversed时，说明还没有比较完毕
      while (x > reversed) {
        // 将x的最后一位加到reversed的末尾，并将x去掉最后一位
        reversed = reversed * 10 + x % 10;
        x /= 10;
      }
      // 比较x和reversed是否相等，或者去掉reversed的最后一位后是否相等（针对奇数位的情况）
      return x == reversed || x == reversed / 10;
    }*/
        // 定义一个函数，判断一个整数是否是回文数
        public static boolean isPalindrome(int x) {
            // 如果x是负数或者能被10整除（除了0），则不可能是回文数
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
            // 定义一个变量，用来存储x的后半部分反转后的值
            int reversed = 0;
            // 循环条件：当x大于reversed时，说明还没有比较完毕
            while (x > reversed) {
                // 将x的最后一位加到reversed的末尾，并将x去掉最后一位
                reversed = reversed * 10 + x % 10;
                x /= 10;
            }
            // 比较x和reversed是否相等，或者去掉reversed的最后一位后是否相等（针对奇数位的情况）
            return x == reversed || x == reversed / 10;
        }

}
