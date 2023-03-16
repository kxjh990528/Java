package Homework.Students;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/21 14:58
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class StudentBiz {
    public double getAvg(Student student){
        double avg;
        avg = (student.java + student.c + student.sql) / 3;
        return avg;
    }
}
