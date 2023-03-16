package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/17 14:04
 * @Description:NULL
 */
public class Demo7 {
    public static void main(String[] args) {
        //1.声明二维数组
        //数据类型 [][]  数组名称;
        //2.分配内存空间
        //数组名称=new 数据类型[行数][列数];
        //3.定义二维数组
        //数据类型[][]数组名称=new 数据类型[行数][列数];
        //String [][]twoary=new String[3][3];
        //4.数组赋值
        //数组名称[行数][列数]=值;
        /* twoary[0][0]="杨过";
         twoary[0][1]="小龙女";
         twoary[0][2]="平哥";

         twoary[1][0]="宋吉";
         twoary[1][1]="丁文星";
         twoary[1][2]="马蓉";

         twoary[2][0]="王建兵";
         twoary[2][1]="老王";
         twoary[2][2]="隔避";*/

        //7.定义二维数组并初始化
        String [][]twoary=new String[][]{
                {"杨 过","小龙女","平 哥"},
                {"宋 吉","丁文星","马 蓉"},
                {"王建兵","老 王","隔 避"}
        };


        //5.获取元素
        System.out.println(twoary[0][0]);

        //6.显示二维数组中所有内容
        for (int i = 0; i < twoary.length ; i++) {  //行数
            for (int j = 0; j < twoary[i].length ; j++) {  //列
                System.out.print(twoary[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
