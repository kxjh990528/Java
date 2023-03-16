package Homework.Count;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/9 16:28
 * @Java version: 1.8.0_361
 * @Description:统计以下字符串中各个字符分别出现的次数:
 * String str="abccbadbacabccdddabc";
 */
public class Count {
    public static void main(String[] args) {
        // 创建一个HashMap对象
        Map<Character, Integer> map = new HashMap<>();

        // 将字符串转换为字符数组
        String str = "abccbadbacabccdddabc";
        char[] chars = str.toCharArray();

        // 遍历字符数组
        for (char c : chars) {
            // 判断HashMap中是否包含该字符作为键
            if (map.containsKey(c)) {
                // 获取其对应的值（即次数），并加一后重新放入HashMap中
                int count = map.get(c);
                count++;
                map.put(c, count);
            } else {
                // 将该字符和1作为键值对放入HashMap中
                map.put(c, 1);
            }
        }
        // 显示Map中的内容
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
