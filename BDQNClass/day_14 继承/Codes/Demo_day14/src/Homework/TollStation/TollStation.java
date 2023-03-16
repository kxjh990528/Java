package Homework.TollStation;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 8:32
 * @Java version: 1.8.0_361
 * @Description:模拟实现高速收费站的收费功能【根据不同的车型实现收费】
 * 假设车型只有两种:
 * 轿车[通过品牌收费，假设只有两种车型:宝马收20 ，非宝马15元]
 * 客车[能过座位数收费，每座2元  ]
 * 实现思路:
 * 定义收费站类: 实现收费的方法
 * 定义车父类:实现计算费用的方法
 * 定义轿车类:重写计算费用的方法
 *  私有属性为车的品牌
 *
 * 定义客车类:重写计算费用的方法
 *  私有属性为客人的数量
 */
public class TollStation {
    public static void main(String[] args) {
        String carType; //车类型
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入车的类型（轿车/客车）：");
        carType = scanner.next();
        if (carType.equals("轿车")){
            SaloonCar saloonCar = new SaloonCar();
            System.out.print("请输入车的品牌：");
            saloonCar.setBrand(scanner.next());
            System.out.println("车的品牌为：" + saloonCar.getBrand() + "\n本次收费：" + saloonCar.charge() + "元");
        }else if (carType.equals("客车")){
            Bus bus = new Bus();
            System.out.print("请输入乘客数量：");
            bus.setPassenger_num(scanner.nextInt());
            System.out.println("客人数量为：" + bus.getPassenger_num() + "\n本次收费：" + bus.charge() + "元");
        }
    }
}
