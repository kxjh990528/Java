package QuikHit;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/6 10:04
 * @Java version: 1.8.0_361
 * @Description:等级属性
 */
public class Level {
    private int levelNo; //等级号
    private int strLength; //每次输入的字符长度
    private int strTimes; //输入次数
    private int timeLimit; //时间限制
    private int perScore;  //每次得分

    public Level() {
    }

    public Level(int levelNo, int strLength, int strTimes, int timeLimit, int perScore) {
        this.levelNo = levelNo;
        this.strLength = strLength;
        this.strTimes = strTimes;
        this.timeLimit = timeLimit;
        this.perScore = perScore;
    }

    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getStrLength() {
        return strLength;
    }

    public void setStrLength(int strLength) {
        this.strLength = strLength;
    }

    public int getStrTimes() {
        return strTimes;
    }

    public void setStrTimes(int strTimes) {
        this.strTimes = strTimes;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getPerScore() {
        return perScore;
    }

    public void setPerScore(int perScore) {
        this.perScore = perScore;
    }
}
