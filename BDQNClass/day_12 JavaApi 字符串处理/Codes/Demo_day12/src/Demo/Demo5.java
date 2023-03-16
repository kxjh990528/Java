package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/24 16:40
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo5 {
    public static void main(String[] args) {
        //找某个字符在字符串中出现多少次
        String str="我国爱国我的国祖国,我国国选择国武汉国搞国军国运会,中国加油";
        String selStr="国";
        //1.获取字符串中的每个字符
       /* int sum=0;
        for(int i=0;i<str.length();i++){
           char c=str.charAt(i);
           //System.out.println(c);
           //if(selStr.equals(c+"")){   //字符串和字符串比
            if(selStr.charAt(0)==c){  //字符与字符
              sum=sum+1;
           }
        }
        System.out.println("总共出现"+sum+"个");*/
        int sum = 0;
        for(int i = 0;i < str.length();i++){
            String c = str.substring(i, i + 1);
            if(c.equals(selStr)){
                sum = sum + 1;  //累计个数
            }
        }
        System.out.println("总共出现" + sum + "个");
    }
}
