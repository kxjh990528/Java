package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/24 15:45
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo2 {
    public static void main(String[] args) {
        //1.定义StringBuffer字符串
        //StringBuffer sb = new StringBuffer();   //定义一个""字符串
        StringBuffer sb = new StringBuffer("a");    //定义一个"a"字符串
        //2.StringBuffer常用方法
        // 2.1 追加字符串
        sb.append("b");
        sb.append("c");
        sb.append("d");
        System.out.println(sb);
        //2.2.删除字符
        //sb.deleteCharAt(2);
        //sb.delete(0, 2);
        //System.out.println(sb);
        //2.3反向字符串
        sb.reverse();
        System.out.println(sb);
        //2.4.将StringBuffer转化为字符串
        String s = sb.toString();
        System.out.println(s);
    }
}
