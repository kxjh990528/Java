package QuikHit;

import java.util.Random;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/6 10:03
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Game {
    private Player player;

    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String printStr(){
        //1.通过用户等级编号找到等级对象
        int levelNo = this.player.getLevelNo();//等级编号1
        System.out.println("当前等级：" + levelNo);
        Level level = LevelParam.levels[levelNo - 1];
        //2.获取用户等级的字符长度
        int len = level.getStrLength();
        //3.生成随机字符
        char []cs = {'a','b','c','d','f','t','x','u','p','y'};
        Random random = new Random();//产生随机数的类对象
        StringBuffer stringBuffer = new StringBuffer();//累计字符
        for (int i = 0; i < len; i++) {
            int math = random.nextInt(cs.length);
            stringBuffer.append(cs[math]);
        }
        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }

    public void printResult(String out,String in){
        //1.考虑超时
        //1.1获取等级的规定的时间
        Level level = LevelParam.levels[player.getLevelNo() - 1];
        int limitTime = level.getTimeLimit();
        //1.2计算用户输入时间
        long end = System.currentTimeMillis();  //记录每次输入完后的结束时间（.currentTimeMillis()记录了自1970年以来到现在的秒数）
        long temp = (end - player.getStartTime())/1000; //时间差
        if(temp > limitTime){
            System.out.println("输入超时，你共花" + temp +"秒，结束");
            System.exit(1);
        }else {
            //2.判断输入内容
            if(out.equals(in)){
                //累计得分
                player.setCurScore(player.getCurScore() + level.getPerScore());
                System.out.println("输入成功，花时" + temp + "，累计得分是：" + player.getCurScore());
            }else {
                System.out.println("输入有误！游戏结束！");
                System.exit(1);
            }
        }
    }
}
