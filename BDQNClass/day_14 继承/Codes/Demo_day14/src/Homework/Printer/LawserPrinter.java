package Homework.Printer;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 17:31
 * @Java version: 1.8.0_361
 * @Description:作业二:编码创建一个打印机类Printer，定义方法print()，
 * 创建两个子类，即针式打印机类DotMatricPrinter和喷墨式打印机Inkpetinter,并在各自类中重写方法print()，
 * 编写测试类实现两种打印机打印，
 * 在添加一个激光打印机类LawserPrinter，重写方法print()，修改测试类实现该打印机打印。
 */
public class LawserPrinter extends Printer{

    public LawserPrinter() {
    }

    @Override
    public void print(){
        System.out.println("激光打印机");
    }
}
