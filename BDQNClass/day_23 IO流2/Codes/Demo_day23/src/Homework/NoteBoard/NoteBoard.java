package Homework.NoteBoard;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/13 10:29
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class NoteBoard {
    Scanner scanner = new Scanner(System.in);
    List<Note> list = new ArrayList<>();
    public static int num;
    public void menu(){
        System.out.println(">>>欢迎使用留言板");
        System.out.println("1.发布留言\t2.查看所有留言\t3.删除留言\t4.修改留言\t5.退出");
        System.out.print("请输入选择的功能：");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                this.publish();
                break;
            case 2:
                this.show();
                break;
            case 3:
                this.delete();
                break;
            case 4:
                this.alter();
                break;
            case 5:
                System.exit(1);
                break;
            default:
                System.out.println("输入有误");
                this.menu();
                break;
        }
    }

    //发布留言
    public void publish(){
        File file = new File("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
        if (file.exists() == true){
            try {
                FileInputStream fileInputStream =
                        new FileInputStream("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                List<Note> list = (List<Note>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                int count = 0;
                for (Note note:list) {
                    count++;
                }
                int id = 0;
                for (int i = 0; i < count; i++) {
                    if (i == count - 1){
                        id = list.get(i).id;
                    }
                }
                Note note = new Note();
                System.out.print("请输入标题：");
                note.title = scanner.next();
                System.out.print("请输入内容：");
                note.contains = scanner.next();
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                note.date = simpleDateFormat.format(date);
                note.id = id + 1;
                list.add(note);
                try {
                    FileOutputStream fileOutputStream =
                            new FileOutputStream("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(list);
                    objectOutputStream.close();
                    fileOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("留言成功！");
                System.out.println();
                this.menu();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (file.exists() == false){
            try {
                Note note = new Note();
                System.out.print("请输入标题：");
                note.title = scanner.next();
                System.out.print("请输入内容：");
                note.contains = scanner.next();
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                note.date = simpleDateFormat.format(date);
                note.id = 1;
                list.add(note);
                try {
                    FileOutputStream fileOutputStream =
                            new FileOutputStream("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt", true);
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(list);
                    objectOutputStream.close();
                    fileOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("留言成功！");
                System.out.println();
                this.menu();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    //展示留言
    public void show() {
        File file = new File("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
        if (file.exists()){
            try {
                FileInputStream fileInputStream =
                        new FileInputStream("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                List<Note> list = (List<Note>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                if (list.size() == 0){
                    System.out.println("留言为空！请先添加留言！");
                    System.out.println();
                    this.menu();
                }else {
                    for (Note note : list) {
                        note.show();
                    }
                }
                System.out.println();
                this.menu();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("文件不存在");
            System.out.println();
            this.menu();
        }
    }

    //删除留言
    public void delete() {
        File file = new File("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
        if (file.exists() == true) {
            try {
                FileInputStream fileInputStream =
                        new FileInputStream("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                List<Note> list = (List<Note>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                System.out.print("请输入要删除的留言序号：");
                int id = scanner.nextInt();
                boolean flag = false;
                if (list.size() == 0) {
                    System.out.println("留言为空！请先添加留言！");
                    System.out.println();
                    this.menu();
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        Note note = list.get(i);
                        if (note.id == id) {
                            list.remove(note);
                            System.out.println("删除成功！");
                            try {
                                FileOutputStream fileOutputStream =
                                        new FileOutputStream("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                                objectOutputStream.writeObject(list);
                                objectOutputStream.close();
                                fileOutputStream.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            flag = true;
                            break;
                        } else if (i == list.size() - 1 && flag == false) {
                            System.out.println("未找到该留言");
                            System.out.println();
                            this.menu();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println();
            this.menu();
        } else if (file.exists() == false) {
            System.out.println("文件不存在，请先输入信息创建文件！");
            System.out.println();
            this.menu();
        }
    }

    //修改留言菜单
    public void alter(){
        System.out.print("修改标题还是内容（1.标题/2.内容）？");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                this.alterTitle();
                break;
            case 2:
                this.alterContains();
                break;
            default:
                System.out.println("输入有误!");
                this.alter();
                break;
        }
    }

    //修改标题
    public void alterTitle(){
        File file = new File("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
        if (file.exists() == true){
            try {
                FileInputStream fileInputStream =
                        new FileInputStream("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                List<Note> list = (List<Note>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                System.out.print("请输入要修改的留言序号：");
                int id = scanner.nextInt();
                boolean flag = false;
                if (list.size() == 0) {
                    System.out.println("留言为空！请先添加留言！");
                    System.out.println();
                    this.menu();
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        Note note = list.get(i);
                        if (note.id == id) {
                            System.out.println("修改前的信息：");
                            note.show();
                            System.out.println("请输入修改后的标题：");
                            note.title = scanner.next();
                            System.out.println("修改后的信息：");
                            note.show();
                            System.out.println("修改成功！");
                            try {
                                FileOutputStream fileOutputStream =
                                        new FileOutputStream("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                                objectOutputStream.writeObject(list);
                                objectOutputStream.close();
                                fileOutputStream.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            flag = true;
                            break;
                        } else if (i == list.size() - 1 && flag == false) {
                            System.out.println("未找到该留言");
                            System.out.println();
                            this.menu();
                        }
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println();
            this.menu();
        }else if (file.exists() == false){
            System.out.println("文件不存在，请先输入信息创建文件！");
            System.out.println();
            this.menu();
        }
    }

    //修改内容
    public void alterContains(){
        File file = new File("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
        if (file.exists() == true){
            try {
                FileInputStream fileInputStream =
                        new FileInputStream("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                List<Note> list = (List<Note>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                System.out.print("请输入要修改的留言序号：");
                int id = scanner.nextInt();
                boolean flag = false;
                if (list.size() == 0) {
                    System.out.println("留言为空！请先添加留言！");
                    System.out.println();
                    this.menu();
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        Note note = list.get(i);
                        if (note.id == id) {
                            System.out.println("修改前的信息：");
                            note.show();
                            System.out.println("请输入修改后的内容：");
                            note.contains = scanner.next();
                            System.out.println("修改后的信息：");
                            note.show();
                            System.out.println("修改成功！");
                            try {
                                FileOutputStream fileOutputStream =
                                        new FileOutputStream("D:\\北大青鸟学习\\java\\day_ch23 IO流2\\Codes\\Demo_day23\\note.txt");
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                                objectOutputStream.writeObject(list);
                                objectOutputStream.close();
                                fileOutputStream.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            flag = true;
                            break;
                        } else if (i == list.size() - 1 && flag == false) {
                            System.out.println("未找到该留言");
                            System.out.println();
                            this.menu();
                        }
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println();
            this.menu();
        }else if (file.exists() == false){
            System.out.println("文件不存在，请先输入信息创建文件！");
            System.out.println();
            this.menu();
        }
    }
}
