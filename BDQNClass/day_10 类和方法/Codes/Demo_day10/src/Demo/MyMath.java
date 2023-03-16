package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/20 19:21
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class MyMath {
    //定义方法
    /*public 返回值类型  方法名称(参数列表){
        方法体….
        [return 返回值;]
    }*/
    //1.定义无参无返回值 的方法
    //输出成法表
    public void  output(){
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"\t");
            }
            System.out.println();
        }
    }

    //2.定义一个方法求两个数的和并输出
    //定义带参数无返回值的方法
    //参数格式:数据类型 参数名称,数据类型  参数名称
    public void  getSum(int one, int two){  //形参列表
        int result = one + two;
        System.out.println("和是:" + result);
    }

    //2.定义一个方法求圆的面积
    //定义带参数无返回值的方法
    //参数格式:数据类型 参数名称,数据类型  参数名称
    public void  getAreaCircle(int r){  //形参列表
        double result = 3.14 * r * r;
        System.out.println("面积是:" + result);
    }
    //3.定义一个方法求长方形的面积，并返回结果
    //带参和带返回值的方法
    public int  getAreaRectangle(int length,int width){
        int result = length * width;
        return  result;   //返回值与返回值类型对应
    }
    //4.定义一个方法求任意数组所有数之和并输出
    //重点理解:数组作为参数传递
    public void getSumArrays(int[]  arys){
        //求数组中所有元素之和
        int sum = 0;
        for (int i = 0; i < arys.length ; i++) {
            sum = sum + arys[i];
        }
        System.out.println("和为:" + sum);
    }
    //数组作为返回值
    //public int[] 方法名称(){}

    public static void main(String[] args) {
        //1.创建类的对象
        MyMath myMath=new MyMath();
        //2.调用方法
        //2.1对象.方法名称([参数列表]);
        myMath.output();
        //2.2调用带参的方法
        myMath.getSum(8,21);   //实参列表
        myMath.getAreaCircle(2);   //求面积
        //2.3调用返回值的方法
        //调用带返回值的方法，返回的结果会放到调用者原地
        int result=myMath.getAreaRectangle(2,3);
        System.out.println("长方形面积是:" + result);
        //2.4调用方法----数组作为方法参数
        int []temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        myMath.getSumArrays(temp);
    }
}
