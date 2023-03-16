package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/24 10:10
 * @Java version: 1.8.0_361
 * @Description:一、String字符串处理
 */
public class Demo1 {
    public static void main(String[] args) {
        //1.声明字符串
        //String s = new String();    //创建一个字符串对象，等价于String s = "";
        //String s = new String("helloworld");  //创建一个字符串对象 等价于
        //String s = "helloworld";
        String s = "helloworld";

        //2.字符串处理的常用属性和方法
        //2.1.获取字符串长度
        int len = s.length();
        System.out.println("字符串长度是：" + len);
        //2.2.比较字符串
        String s2 = new String("Helloworld");
        //if(s == s2){  //用==比较字符串时，判断两个字符串是否为相同地址
        //if(s.equals(s2)){ //用equals比较字符串时，判断两个字符串的内容是否相同，区分大小写
        if (s.equalsIgnoreCase(s2)) {    //判断两个字符串的内容是否相同，不区分大小写
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
        //2.3.字符串大小写转换
        String snew = s.toUpperCase();  //将字符串转化为大写
        System.out.println(snew);
        String snew1 = s.toLowerCase(); //将字符串转化为小写
        System.out.println(snew1);
        //2.4.连接字符串 （效率低）===>StringBuffer
        String s3 = "hellokity";
        //String newStr = s + s3;
        String newStr = s.concat(s3);
        System.out.println(newStr);
        //2.5.查找某字符在字符串中第一次出现的位置  位置从0开始
        int pos = s.indexOf("o");   //从前往后找，没有出现该字符返回-1
        System.out.println("o出现的位置是:" + pos);
        pos = s.lastIndexOf("e");
        System.out.println("e出现的位置是:" + pos);
        //2.6.截取字符串
        String subString = s.substring(1);  //从指定位置截取到最后
        System.out.println(subString);
        subString = s.substring(1, 5);  //从指定位置截取到结束位置（不包含结束位置）
        System.out.println(subString);
        //2.7.查找指定位置的字符
        char c = s.charAt(1);
        System.out.println(c);
        //2.8.替换字符
        String newStr2 = s.replace("o", "K");
        System.out.println(newStr2);
        //2.9.分隔字符串
        String names = "张三,李四,王五";
        String[] ns = names.split(",");
        for (int i = 0; i < ns.length; i++) {
            System.out.println(ns[i]);
        }
    }
}
