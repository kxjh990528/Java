package self;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 10:19
 * @Description:求1-100的和
 */
public class Demo2 {
    public static void main(String[] args) {
        //示例:使用while循环实现 1+2+3+4+5....100的和
        //分析
    /*
    int sum=0;   //累加器
    sum=sum+1;  //1
    sum=sum+2;  //3
    sum=sum+3;  //6
    sum=sum+4;   //10
    ....
    sum=sum+100;  //?*/

        int sum=0;
        int i=1;  //控制循环次数
        while(i<=100){   //变量的条件
            //System.out.println(i);
            sum=sum+i;  //循环累加

            i++;  //变量的自增或者自减
        }
        System.out.println("1-100的和是:"+sum);
    }
}
