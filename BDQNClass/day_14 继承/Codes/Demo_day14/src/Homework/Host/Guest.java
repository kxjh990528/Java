package Homework.Host;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 17:47
 * @Java version: 1.8.0_361
 * @Description:作业三:请使用方法重写实现以下需求:梅云飞有两个很要好的朋友，一个是中国的向冲，喜欢吃四川菜，练太极拳;
 * 一个是美国的董龙，喜欢吃比萨，打橄榄球。每当朋友来拜访梅云飞时，梅云飞都会按各人的喜好招待他们.
 * 主人 = 客人[多个客人]
 * 主人.招待方法();
 */
public class Guest extends Host{

    public Guest() {
    }

    public void entertain(){    //招待方法
        super.entertain();
        System.out.println("客人名：" + super.getGuestname());
        System.out.println("客人国籍：" + super.getNationnality());
        System.out.println("招待方法：" + super.getDietary_habit() + "和" + super.getExercise_habit());
    }
}
