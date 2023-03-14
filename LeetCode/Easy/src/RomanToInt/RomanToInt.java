package RomanToInt;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 17:24
 * @Java version: 1.8.0_361
 * @Description:罗马数字转整数
 */
public class RomanToInt {
    // A function to find the value of a Roman symbol
    public static int romanValue(char c){
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    // A function to convert a Roman numeral to an integer
    public static int romanToInteger(String s){
        int result = 0;
        //Iterate over the given Roman string, from left to right
        for (int i = 0; i < s.length(); i++) {
            // Gets the integer value of the current character
            int value = romanValue(s.charAt(i));
            // If the current character is not the last and is smaller than the corresponding value of the next character,
            // the value needs to be subtracted
            if (i < s.length() - 1 && value < romanValue(s.charAt(i + 1)))
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
