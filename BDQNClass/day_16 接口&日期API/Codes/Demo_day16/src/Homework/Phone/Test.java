package Homework.Phone;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/3 13:56
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Test {
    public static void main(String[] args) {
        CommonHandset commonHandset = new CommonHandset();
        commonHandset.play("再见深海");
        commonHandset.sendInfo();
        commonHandset.call();

        AptitudeHandset aptitudeHandset = new AptitudeHandset();
        aptitudeHandset.networkConn();
        aptitudeHandset.play("红海行动");
        aptitudeHandset.takePictures();
        aptitudeHandset.sendInfo();
        aptitudeHandset.call();
    }
}
