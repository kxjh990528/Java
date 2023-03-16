package Demo.Demo2;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/3 10:27
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class SafeDoorBell implements Door, Lock, Bell{
    public SafeDoorBell() {
    }

    @Override
    public void openDoor() {//开门
        System.out.println("The door is opend.");
    }

    @Override
    public void closeDoor() {//关门
        System.out.println("The door is closed.");
    }

    @Override
    public void lock() {//上锁
        System.out.println("The door is locked.");
    }

    @Override
    public void unlock() {//开锁
        System.out.println("The door is unlocked.");
    }

    @Override
    public void sound() {
        System.out.println("The bell is ringing.");
    }
}
