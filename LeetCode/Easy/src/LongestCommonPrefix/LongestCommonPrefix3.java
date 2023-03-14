package LongestCommonPrefix;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/14 17:45
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
//分治法Divide and rule
public class LongestCommonPrefix3 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        } else {
            return longestCommonPrefix(strs, 0, strs.length - 1);
        }
    }

    public static String longestCommonPrefix(String[] strs, int start, int end) {
        if (start == end) {
            return strs[start];
        } else {
            int mid = (end - start) / 2 + start;
            String lcpLeft = longestCommonPrefix(strs, start, mid);
            String lcpRight = longestCommonPrefix(strs, mid + 1, end);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    public static String commonPrefix(String lcpLeft, String lcpRight) {
        int minLength = Math.min(lcpLeft.length(), lcpRight.length());
        for (int i = 0; i < minLength; i++) {
            if (lcpLeft.charAt(i) != lcpRight.charAt(i)) {
                return lcpLeft.substring(0, i);
            }
        }
        return lcpLeft.substring(0, minLength);
    }

    public static void main(String[] args) {
        LongestCommonPrefix3 longestCommonPrefix = new LongestCommonPrefix3();
        String[] strs = {"leetcode","leet","lee","le"};
        System.out.println(longestCommonPrefix(strs));
    }
}
