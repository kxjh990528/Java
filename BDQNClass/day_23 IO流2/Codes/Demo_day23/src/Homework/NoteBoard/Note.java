package Homework.NoteBoard;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/13 10:35
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Note implements Serializable {
    public int id;   //序号
    public String title;    //标题
    public String contains; //内容
    public String date;   //日期

    public void show(){
        System.out.println("序号：" + this.id + "\t标题：" + this.title + "\t时间：" + date);
        System.out.println("内容：" + this.contains);
        System.out.println("__________________________________________");
    }
}
