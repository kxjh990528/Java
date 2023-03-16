package Homework.TollStation;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 8:33
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
//客车类
public class Bus extends Vehicle {
    private int passenger_num;  //客人数量

    public Bus() {
    }

    public int getPassenger_num() {
        return passenger_num;
    }

    public void setPassenger_num(int passenger_num) {
        this.passenger_num = passenger_num;
    }

    @Override
    public int charge() {
        return this.passenger_num * 2;
    }
}
