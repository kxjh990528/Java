package Homework.Phone;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/2 16:57
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
//普通手机类
public class CommonHandset extends HandSet implements PlayWiring{
    public CommonHandset() {
        System.out.println("Constructing a common handset...");
    }

    @Override
    public void sendInfo() {
        super.sendInfo();
    }

    @Override
    public void call() {
        super.call();
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public void play(String s) {
        System.out.println("歌曲《"+ s +"》播放中...");
    }
}
