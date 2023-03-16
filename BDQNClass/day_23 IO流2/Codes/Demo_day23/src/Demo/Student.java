package Demo;

import java.io.Serializable;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/13 9:54
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Student implements Serializable {
    public int id;
    public String name;
    public String gender;


    public void show() {
        System.out.println("Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}');
    }
}
