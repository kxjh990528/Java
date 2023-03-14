package RomanToInt;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 17:24
 * @Java version: 1.8.0_361
 * @Description:罗马数字转整数
 */
public class RomanToInt2 {
    // A function to find the value of a Roman symbol
    static Map<Character, Integer> map = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    // A function to convert a Roman numeral to an integer
    public static int romanToInteger(String s){
        int result = 0;
        //Iterate over the given Roman string, from left to right
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            // If the current character is not the last and is smaller than the corresponding value of the next character,
            // the value needs to be subtracted
            if (i < s.length() - 1 && value < map.get(s.charAt(i + 1)))
                result -= value;
            else
                // Otherwise, this value needs to be added
                result += value;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInteger(s));
    }
}
