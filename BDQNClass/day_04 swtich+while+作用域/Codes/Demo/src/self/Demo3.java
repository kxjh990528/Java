package self;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/13 10:21
 * @Description:求1-100的奇数和
 */
public class Demo3 {
    public static void main(String[] args) {
        int sum=0;
        int i=1;  //控制循环次数
        while(i<=100){   //变量的条件

            if(i%2!=0) {
                //System.out.println(i);
                sum=sum+i;  //累加
            }

            i++;  //变量的自增或者自减
        }
        System.out.println("1-100的奇数和是:"+sum);
    }
}
