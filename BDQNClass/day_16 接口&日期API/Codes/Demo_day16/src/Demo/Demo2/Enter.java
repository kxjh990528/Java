package Demo.Demo2;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/3 10:33
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Enter {
    public static void main(String[] args) {
        SafeDoorBell safeDoorBell = new SafeDoorBell();
        System.out.println("The visitor is coming...");
        safeDoorBell.sound();
        safeDoorBell.unlock();
        safeDoorBell.openDoor();
        System.out.println("Please come in.");
        safeDoorBell.closeDoor();
        safeDoorBell.lock();
    }
}
