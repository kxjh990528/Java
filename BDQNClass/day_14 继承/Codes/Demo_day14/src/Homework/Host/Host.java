package Homework.Host;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 17:40
 * @Java version: 1.8.0_361
 * @Description:作业三:请使用方法重写实现以下需求:梅云飞有两个很要好的朋友，
 * 一个是中国的向冲，喜欢吃四川菜，练太极拳;一个是美国的董龙，喜欢吃比萨，打橄榄球。每当朋友来拜访梅云飞时，梅云飞都会按各人的喜好招待他们.
 * 主人 = 客人[多个客人]
 * 主人.招待方法();
 */
public class Host { //主人类
    private String hostname;  //主人名
    private String guestname;    //客人名字
    private String nationnality;    //客人国籍
    private String dietary_habit;   //饮食习惯
    private String exercise_habit;  //运动习惯

    public Host() {
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getGuestname() {
        return guestname;
    }

    public void setGuestname(String guestname) {
        this.guestname = guestname;
    }

    public String getNationnality() {
        return nationnality;
    }

    public void setNationnality(String nationnality) {
        this.nationnality = nationnality;
    }

    public String getDietary_habit() {
        return dietary_habit;
    }

    public void setDietary_habit(String dietary_habit) {
        this.dietary_habit = dietary_habit;
    }

    public String getExercise_habit() {
        return exercise_habit;
    }

    public void setExercise_habit(String exercise_habit) {
        this.exercise_habit = exercise_habit;
    }

    public void entertain(){    //招待方法
        System.out.println("主人：" + this.getHostname());
    }
}
