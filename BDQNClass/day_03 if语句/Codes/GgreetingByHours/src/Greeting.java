import java.util.Date;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/12 19:09
 * @Description:5.实现电脑自动根据用户上机时间进行问好
 */
public class Greeting {
    public static void main(String[] args) {
        int hours;  //当前小时
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
        //System.out.println(date.getHours());
        hours = date.getHours();
        if (hours >= 6 && hours < 8){
            System.out.println("早上好~");
        }else if (hours >= 8 && hours <12){
            System.out.println("安心上网，无人打扰~");
        }else if (hours >= 12 && hours <14){
            System.out.println("中午好~");
        }else if (hours >= 14 && hours <17){
            System.out.println("安心上网，无人打扰~");
        }else if (hours >= 17 && hours <20){
            System.out.println("该吃晚饭了~");
        }else if (hours >= 20 && hours <22){
            System.out.println("晚上好~");
        }else if (hours >= 22 && hours <= 24){
            System.out.println("睡觉哦！");
        }else if (hours >= 0 && hours <6){
            System.out.println("睡觉哦！");
        }
    }
}
