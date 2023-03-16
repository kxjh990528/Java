package Homework.Host;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 17:54
 * @Java version: 1.8.0_361
 * @Description:作业三:请使用方法重写实现以下需求:梅云飞有两个很要好的朋友，一个是中国的向冲，喜欢吃四川菜，练太极拳;
 * 一个是美国的董龙，喜欢吃比萨，打橄榄球。每当朋友来拜访梅云飞时，梅云飞都会按各人的喜好招待他们.
 * 主人 = 客人[多个客人]
 * 主人.招待方法();
 */
public class Test {
    public static void main(String[] args) {

        Host xiangchong = new Guest();
        xiangchong.setHostname("梅云飞");
        xiangchong.setGuestname("向冲");
        xiangchong.setNationnality("中国");
        xiangchong.setDietary_habit("四川菜");
        xiangchong.setExercise_habit("练太极拳");
        xiangchong.entertain();
        System.out.println();

        Host donglong = new Guest();
        donglong.setHostname("梅云飞");
        donglong.setGuestname("董龙");
        donglong.setNationnality("美国");
        donglong.setDietary_habit("吃披萨");
        donglong.setExercise_habit("打橄榄球");
        donglong.entertain();
    }
}
