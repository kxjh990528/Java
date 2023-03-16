package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/19 9:25
 * @Description:冒泡排序
 */
public class Bubble_Sort {
    public static void main(String[] args) {
        int arys[] = {3, 9, 1, 6};
        /*
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

         */
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

        for (int i = 0; i < arys.length; i++) {
            System.out.print(arys[i] + " ");
        }
        System.out.println();
    }
}
