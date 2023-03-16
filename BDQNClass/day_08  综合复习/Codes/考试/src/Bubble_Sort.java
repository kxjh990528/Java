
/**
 * @Author: 林宇扬
 * @Date: 2023/2/20 14:44
 * @Description:作业2:使用冒泡排序法将以下数组进行排序
 * Int [] arys={10,90,50,30,60,40};
 */
public class Bubble_Sort {
    public static void main(String[] args) {
        int arys[] = {10, 90, 50, 30, 60, 40};
        System.out.println("排序前：");
        for (int i = 0; i < arys.length; i++) {
            System.out.print(arys[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < arys.length; i++) {
            for (int j = 0; j < arys.length - i; j++) {
                if (arys[j] > arys[j+1]){
                    int tmp;
                    //从小到大输出
                    tmp = arys[j+1];
                    arys[j+1] = arys[j];
                    arys [j] = tmp;
                }
            }
        }
        System.out.println("排序后（从小到大）：");
        for (int i = 0; i < arys.length; i++) {
            System.out.print(arys[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < arys.length; i++) {
            for (int j = 0; j < arys.length - i; j++) {
                if (arys[j] < arys[j+1]){
                    int tmp;
                    //从大到小输出
                    tmp = arys[j];
                    arys[j] = arys[j+1];
                    arys [j+1] = tmp;
                }
            }
        }
        System.out.println("排序后（从大到小）：");
        for (int i = 0; i < arys.length; i++) {
            System.out.print(arys[i] + " ");
        }
        System.out.println();
    }
}
