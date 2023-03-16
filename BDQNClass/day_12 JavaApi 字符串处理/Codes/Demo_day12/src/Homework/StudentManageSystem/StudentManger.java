package Homework.StudentManageSystem;

import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/2/21 20:05
 * @Java version: 1.8.0_361
 * @Description:5.在上次课的项目中添加一个功能:
 * 按学生姓名查询
 * 效果如下:请输入学生姓名:张    [支持模糊查询]indexof
 * 显示具体信息………
 **/
public class StudentManger {
    //输入对象 属性
    Scanner input = new Scanner(System.in);
    //定义学生数组用于存储学生信息: 10
    Student [] stulist = new Student[10];
    //控制学生人数
    int count = 0;

    //主菜单
    public void mainMenu(){
        System.out.println("\t\t欢迎使用学生管理系统");
        System.out.println(">>>1.添加学生 2.查询学生  3.删除学生 4.修改学生信息 5.退出");
        System.out.print("请选择功能:");
        int tmp = input.nextInt();
        switch (tmp){
            case 1:
                this.addStudent();
                break;
            case 2:
                this.secondMenu();
                break;
            case 3:
                this.deleteStudent();
                break;
            case 4:
                this.alterInfo();
                break;
            case 5:
                //退出
                System.exit(1);
                break;
            default:
                System.out.println("输入有误，请重新输入");
                this.mainMenu();
                break;
        }
    }

    //二级菜单
    public void secondMenu(){
        System.out.println("\t\t学生管理系统（二级菜单）");
        System.out.println(">>>1.按姓名查找（支持模糊查询） 2.显示所有 3.返回上级菜单 4.退出");
        System.out.print("请选择功能:");
        int tmp = input.nextInt();
        switch (tmp){
            case 1:
                this.searchStudentByName();
                break;
            case 2:
                this.showAllStudents();
                break;
            case 3:
                this.mainMenu();
                break;
            case 4:
                System.exit(1);
                break;
            default:
                System.out.println("输入有误，请重新输入");
                this.secondMenu();
                break;
        }
    }

    //功能一：添加学生
    public void addStudent(){
        if (count > stulist.length){
            System.out.println("学生数量已满，添加失败！");
            //return; //退出方法
            this.mainMenu();
        }else {
            System.out.println("录入添加学生信息>>>");
            Student student = new Student();
            System.out.print("请输入学生的学号：");
            student.id = input.nextInt();
            //学号查重
            for (int i = 0; i < stulist.length; i++) {
                Student s1 = new Student();
                s1 = stulist[i];
                if (s1 != null && s1.id == student.id){
                    System.out.println("该学号已经存在，请重新输入！");
                    this.addStudent();
                    break;
                }
            }
            System.out.print("请输入学生的姓名：");
            student.name = input.next();
            System.out.print("请输入学生的年龄：");
            student.age = input.nextInt();
            /*System.out.print("请输入学生在读状态（1 在读；0 休学）：");
            student.state = input.nextShort();*/
            //System.out.println("在读状态采用默认值0");
            student.state = 0;  //在读

            stulist[count] = student;   //将学生存入数组
            count ++;   //记录学生数量
            System.out.println("添加成功");

            //询问
            System.out.println("是否想继续添加(y|n)？");
            String flag = input.next();
            if(flag.equals("y"))
                addStudent();
            else
                this.mainMenu();
        }
    }

    //功能：按姓名查找
    public void searchStudentByName() {
        System.out.println(">>>请输入学生姓名:（支持模糊查询）");
        String name = input.next();

        if (count == 0) {    //代表第一个对象student就为空
            System.out.println("未录入任何信息！请录入以后再重新输入！");
            this.mainMenu();
        } else {
            for (int i = 0; i < count; i++) {
                Student student = new Student();
                student = stulist[i];
                int pos = student.name.indexOf(name);
                if (pos != -1) {
                    System.out.println("学号：" + student.id + "\t姓名：" + student.name + "\t年龄：" + student.age +
                            "\t在读状态：" + (student.state == 0 ? "在读" : "休学"));
                } else if (count != 0 && i != 0 && pos == -1) {
                    System.out.println("输入信息有误，未查找到该学生，请重新输入！");
                    this.secondMenu();
                }
            }
        }
        System.out.println("是否想返回上一级y|n");
        String flag = input.next();
        if (flag.equals("y"))
            this.mainMenu();
        else
            this.secondMenu();
    }

    //功能：显示所有学生
    public void showAllStudents(){
        System.out.println(">>>显示所有学生信息:");

        //冒泡排序
        for (int i = 0; i < count; i++) {   //此处count不能换成stulist.length
            for (int j = 0; j < count - 1; j++) {   //stulist.length始终是10，如果数组没有填满之前会报空指针错误
                if (stulist[j].age > stulist[j+1].age){
                    Student tmp= stulist[j + 1];
                    stulist[j + 1] = stulist[j];
                    stulist[j] = tmp;
                }
            }
        }

        for (int i = 0; i < stulist.length; i++) {
            Student student = stulist[i];

            if (student != null){
                System.out.println("第" + (i+1) + "个学生信息：");
                System.out.println("学号：" + student.id + "\t姓名：" + student.name + "\t年龄：" + student.age +
                        "\t在读状态：" + (student.state == 0 ? "在读":"休学"));
            }else if(student == null){
                if (i == 0){
                    System.out.println("未录入任何学生信息，请录入后重新输入！");
                    this.mainMenu();
                }
            }
        }

        System.out.println("是否想返回上一级y|n");
        String flag = input.next();
        if(flag.equals("y"))
            this.mainMenu();
        else
            this.secondMenu();
    }

    //删除学生
    public void deleteStudent() {
        System.out.println("请输入要删除学生的学号：");
        int id = input.nextInt();
        if (count == 0) {//没有学生信息时
            System.out.println("库中没有学生信息，删除失败！请添加信息后重试！");
            //return; //退出方法
            this.mainMenu();
        }else if (count != 0){
            boolean flag = false;
            for (int i = 0; i < count; i++) {
                Student student = new Student();
                student = stulist[i];
                if (student.id == id){
                    System.out.println("学号：" + student.id + "\t姓名：" + student.name + "\t年龄：" + student.age +
                            "\t在读状态：" + (student.state == 0 ? "在读":"休学"));
                    System.out.println("删除成功");
                    stulist[i] = null;
                    for (int j = i; j < count; j++) {
                        stulist[j] = stulist[j + 1];
                    }
                    flag = true;
                    count--;
                    break;
                }
            }
            if(flag == false){//有学生信息但是找不到该学生时
                System.out.println("未搜索到该学生，可能是学号输入错误，请重新输入！");
                this.mainMenu();
            }
        }
    }

    //修改学生信息菜单
    public void alterInfo(){
        System.out.println("\t\t学生信息修改系统（二级菜单）");
        System.out.println(">>>1.修改学生姓名 2.修改学生年龄 3.修改学生在读状态 4.返回上级菜单 5.退出");
        System.out.print("请选择功能:");
        int tmp = input.nextInt();
        switch (tmp){
            case 1:
                this.alterName();
                break;
            case 2:
                this.alterAge();
                break;
            case 3:
                this.regularService();
                break;
            case 4:
                this.mainMenu();
                break;
            case 5:
                System.exit(1);
                break;
            default:
                System.out.println("输入有误，请重新输入");
                this.alterInfo();
                break;
            }
    }


    //修改学生姓名
    public void alterName(){
        System.out.println("请输入要修改姓名的学生学号：");
        int id = input.nextInt();
        if (count == 0) {//没有学生信息时
            System.out.println("库中没有学生信息，修改失败！请添加信息后重试！");
            //return; //退出方法
            this.mainMenu();
        }else {
            boolean flag = false;
            for (int i = 0; i < count; i++) {
                Student student = new Student();
                student = stulist[i];
                if (student.id == id){
                    System.out.println("请输入新的姓名：");
                    student.name = input.next();
                    System.out.println("学号：" + student.id + "\t姓名：" + student.name + "\t年龄：" + student.age +
                            "\t在读状态：" + (student.state == 0 ? "在读":"休学"));
                    System.out.println("修改成功");
                    flag = true;
                }
            }
            if(flag == false){//有学生信息但是找不到该学生时
                System.out.println("未搜索到该学生，可能是学号输入错误，请重新输入！");
                this.alterInfo();
            }
        }
        System.out.println("是否想返回上一级y|n");
        String flag = input.next();
        if(flag.equals("y"))
            this.mainMenu();
        else
            this.alterInfo();
    }

    //修改学生年龄
    public void alterAge(){
        System.out.println("请输入要修改年龄的学生学号：");
        int id = input.nextInt();
        if (count == 0) {//没有学生信息时
            System.out.println("库中没有学生信息，修改失败！请添加信息后重试！");
            //return; //退出方法
            this.mainMenu();
        }else {
            boolean flag = false;
            for (int i = 0; i < count; i++) {
                Student student = new Student();
                student = stulist[i];
                if (student.id == id){
                    System.out.println("请输入新的年龄：");
                    student.age = input.nextInt();
                    System.out.println("学号：" + student.id + "\t姓名：" + student.name + "\t年龄：" + student.age +
                            "\t在读状态：" + (student.state == 0 ? "在读":"休学"));
                    System.out.println("修改成功");
                    flag = true;
                }
            }
            if(flag == false){//有学生信息但是找不到该学生时
                System.out.println("未搜索到该学生，可能是学号输入错误，请重新输入！");
                this.alterInfo();
            }
        }
        System.out.println("是否想返回上一级y|n");
        String flag = input.next();
        if(flag.equals("y"))
            this.mainMenu();
        else
            this.alterInfo();
    }

    //办理休学菜单
    public void regularService(){
        System.out.println("\t\t常规业务菜单");
        System.out.println(">>>1.办理休学(通过学号)  2.办理复学  3.返回上级菜单 4.退出");
        System.out.print("请选择功能:");
        int tmp = input.nextInt();
        switch (tmp){
            case 1:
                this.applyForSuspension();
                break;
            case 2:
                this.goBackToSchool();
                break;
            case 3:
                this.mainMenu();
                break;
            case 4:
                System.exit(1);
                break;
            default:
                System.out.println("输入有误，请重新输入");
                this.regularService();
                break;
        }
    }

    //办理休学(通过学号)
    public void applyForSuspension(){
        System.out.println(">>>请输入学生学号:");
        int id = input.nextInt();
        for (int i = 0; i < stulist.length; i++) {
            Student student = new Student();
            student = stulist[i];
            if (student != null && student.id == id) {
                if (student != null && student.state == 1){
                    System.out.println("该生已经在休学！请勿重复申请！");
                    break;
                }else if (student != null && student.state == 0){
                    student.state = 1;
                    System.out.println("办理成功!请确认信息！");
                    System.out.println("学号：" + student.id + "\t姓名：" + student.name + "\t年龄：" + student.age +
                            "\t在读状态：" + (student.state == 0?"在读":"休学"));
                    break;
                }
            }else if (student == null) {
                if (i == 0){
                    System.out.println("未录入任何学生信息，请录入后重新输入！");
                    this.mainMenu();
                }else if (i != 0){
                    System.out.println("未查找到该学生信息，可能学号输入错误！请确认后重新输入");
                    this.applyForSuspension();
                }
            }
        }
        System.out.println("是否想返回上一级y|n");
        String flag = input.next();
        if(flag.equals("y"))
            this.mainMenu();
        else
            this.regularService();
    }

    //办理复学
    public void goBackToSchool(){
        System.out.println(">>>请输入学生学号:");
        int id = input.nextInt();
        for (int i = 0; i < stulist.length; i++) {
            Student student = new Student();
            student = stulist[i];
            if (student != null && student.id == id) {
                if (student.state == 0){
                    System.out.println("该生已经复学！请勿重复申请！");
                    break;
                }else if(student != null && student.state == 1){
                    student.state = 0;
                    System.out.println("办理成功!请确认信息！");
                    System.out.println("学号：" + student.id + "\t姓名：" + student.name + "\t年龄：" + student.age +
                            "\t在读状态：" + (student.state == 0 ? "在读":"休学"));
                    break;
                }
            }else if (student == null) {
                if (i == 0){
                    System.out.println("未录入任何学生信息，请录入后重新输入！");
                    this.mainMenu();
                }else if (i != 0){
                    System.out.println("未查找到该学生信息，可能学号输入错误！请确认后重新输入");
                    this.goBackToSchool();
                }
            }
        }
        System.out.println("是否想返回上一级y|n");
        String flag = input.next();
        if(flag.equals("y"))
            this.mainMenu();
        else
            this.regularService();
    }

}
