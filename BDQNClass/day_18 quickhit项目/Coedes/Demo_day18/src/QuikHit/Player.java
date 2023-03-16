package QuikHit;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/6 10:02
 * @Java version: 1.8.0_361
 * @Description:玩家属性
 */
public class Player {
    private int levelNo;  //等级编号
    private int curScore;  //得分
    private long startTime; //开始时间
    private long elapsedTime;  //已用时间

    public Player() {
    }

    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getCurScore() {
        return curScore;
    }

    public void setCurScore(int curScore) {
        this.curScore = curScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    //玩家
    public void play() {
        Scanner input = new Scanner(System.in);
        //2.系统输出字符串
        Game game = new Game();
        //将玩家对象设置游戏中
        game.setPlayer(this);

        //控制六个等级
        for (int k = 1; k <= LevelParam.levels.length; k++) {
            //1.设置玩家的等级
            this.levelNo = k;
            //获取用户等级对象
            Level level = LevelParam.levels[this.levelNo - 1];
            //3.控制当前等级的多少次输入
            // 记录玩家的开始时间
            this.startTime = System.currentTimeMillis();
            for (int i = 0; i < level.getStrTimes(); i++) {
                //系统输出字符串
                String outStr = game.printStr();
                System.out.println("产生的字符:" + outStr);
                //3.玩家输入字符串

                System.out.print("请输入字符中:");
                String in = input.next();
                //4.系统比对:输出结果
                game.printResult(outStr, in);
            }
            System.out.println("升级啦!,进入下一关");
        }
    }
}
