package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/27 16:37
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Test {
    public static void main(String[] args) {
        //发生重写
        //Parent parent = new Son();
        //parent.walk();
        Person person = new Student(1, "张三", 19);
        person.show();
    }
}
