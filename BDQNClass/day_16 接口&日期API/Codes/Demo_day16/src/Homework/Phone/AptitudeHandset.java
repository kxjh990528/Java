package Homework.Phone;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/2 16:53
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class AptitudeHandset extends HandSet implements Network, TakePictures, PlayWiring{
    public AptitudeHandset() {
        System.out.println("Constructing an aptitude handset...");
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
    public void networkConn() {
        System.out.println("网络连接中...");
    }

    @Override
    public void takePictures() {
        System.out.println("打开相机...");
    }

    @Override
    public void play(String s) {
        System.out.println("视频《" + s + "》正在播放中...");
    }
}
