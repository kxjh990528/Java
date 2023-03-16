package Homework.ShowStudent;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/1 13:45
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        student.setSut_id(1);
        student.setName("张三");
        student.setAge(18);
        student.show();
    }
}
