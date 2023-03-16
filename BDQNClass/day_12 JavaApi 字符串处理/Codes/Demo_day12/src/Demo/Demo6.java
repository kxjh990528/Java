package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/24 16:48
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo6 {
    public static void main(String[] args) {
        //将字符串日期转化为2022年9月6号
        String str = "2022-9-6"; //===>2022年9月6号
        //1.折分字符串
        String arys[] = str.split("-");
        /*System.out.println(arys[0]);
        System.out.println(arys[1]);
        System.out.println(arys[2]);*/
        //2.合并字符串(频繁加字符串-->推荐StringBuffer)
        StringBuffer sb = new StringBuffer("");
        sb.append(arys[0]);
        sb.append("年");
        sb.append(arys[1]);
        sb.append("月");
        sb.append(arys[2]);
        sb.append("号");
        System.out.println("日期是:" + sb.toString());
    }
}
