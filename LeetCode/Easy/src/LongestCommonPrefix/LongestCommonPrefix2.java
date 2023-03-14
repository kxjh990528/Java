package LongestCommonPrefix;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/13 19:43
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
//纵向扫描Longitudinal scanning
public class LongestCommonPrefix2 {
    public static String longestCommonPrefix(String[] strs) {
        //Returns an empty string if the string array is empty or the length is 0
        if (strs == null || strs.length == 0)
            return "";
        //Walk through each column of all strings from front to back,
        // comparing whether the characters on the same column are the same
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    //Returns a prefix value when the string being compared reaches its maximum length
                    // or if the current column character does not match
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        LongestCommonPrefix2 longestCommonPrefix = new LongestCommonPrefix2();
        String[] strs = {"dogabc","dog","do"};
        System.out.println(longestCommonPrefix(strs));
    }
}
