package LongestCommonPrefix;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/13 19:43
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
//横向扫描Transverse scanning
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        //Returns an empty string if the string array is empty or the length is 0
        if (strs == null || strs.length == 0) {
            return "";
        }
        //Set the first string as a prefix and compare to other strings
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {
                //If prefix.length() == 0,means there is no commn prefix,
                //Break out of the loop
                break;
            }
        }
        return prefix;
    }

    //比较Compare
    public static String longestCommonPrefix(String str1, String str2){
        //Gets the minimum length of two strings
        //Generally, the common prefix does not exceed the minimum length of the string
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
