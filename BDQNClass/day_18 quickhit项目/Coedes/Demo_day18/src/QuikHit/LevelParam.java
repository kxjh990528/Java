package QuikHit;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/6 10:07
 * @Java version: 1.8.0_361
 * @Description:NULL
 */

//等级参数类  存放所有的等级
public class LevelParam {
    public static Level [] levels=new Level[6];

    public LevelParam() {
    }

    //静态代码块初始化
    static {
        levels[0]=new Level(1,3,3,30,1);
        levels[1]=new Level(2,4,3,40,2);
        levels[2]=new Level(3,5,3,50,3);
        levels[3]=new Level(4,6,3,60,4);
        levels[4]=new Level(5,7,3,70,5);
    }
}
