package Homework.ProductManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/7 16:18
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class ProductManage {
    ArrayList<Product> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        System.out.println("\t\t欢迎使用商品库存管理平台");
        System.out.println(">>>1.添加商品 2.删除商品 3.查询商品单价 4.显示所有商品 5.按价格搜索商品 6.退出");
        System.out.print("请选择功能:");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                this.add();
                break;
            case 2:
                this.delete();
                break;
            case 3:
                this.searchPrice();
                break;
            case 4:
                this.show();
                break;
            case 5:
                this.searchByPrice();
                break;
            case 6:
                System.exit(1);
                break;
            default:
                System.out.println("输入错误，请重新输入");
                break;
        }
    }

    //添加商品
    public void add(){
        System.out.println(">>> 添加商品");
        System.out.print("输入商品编号：");
        int id = scanner.nextInt();
        for (Product product:list) {
            if(product.getId() == id){
                System.out.println("商品编号重复,请重新添加");
                this.add();
            }
        }
        System.out.print("输入商品名称：");
        String name = scanner.next();
        System.out.print("输入商品单价：");
        float price = scanner.nextFloat();
        System.out.print("输入商品数量：");
        int count = scanner.nextInt();
        list.add(new Product(id, name, price, count));
        System.out.println("添加成功");
        //询问
        System.out.println("是否继续操作(y/n)?");
        String flag = scanner.next();
        if (flag.equals("y"))
            this.add();
        else
            this.menu();
        System.out.println();
    }

    //删除商品
    public void delete(){
        if (list.size() == 0){
            System.out.println("还未添加商品，请先添加！");
            this.menu();
        }else {
            System.out.println(">>> 删除商品");
            System.out.print("请输入要删除的商品编号：");
            int id = scanner.nextInt();
            boolean flag = false;
            for (int  i = 0; i < list.size(); i++) {
                Product product = list.get(i);
                if (product.getId() == id){
                    list.remove(product);
                    System.out.println("删除成功！");
                    flag = true;
                    break;
                }
                if (i == list.size() - 1 && flag == false){
                    System.out.println("未查找到该商品");
                }
            }
        }
        //询问
        System.out.println("是否继续操作(y/n)?");
        String flag = scanner.next();
        if (flag.equals("y"))
            this.delete();
        else
            this.menu();
        System.out.println();
    }

    //查询商品单价
    public void searchPrice() {
        if (list.size() == 0) {
            System.out.println("还未添加商品，请先添加！");
            this.menu();
        } else {
            System.out.println(">>> 查询商品单价");
            System.out.print("请输入要查询单价的商品编号：");
            int id = scanner.nextInt();
            int count = 1;
            for (int i = 0; i < list.size(); i++) {
                Product product = list.get(i);
                if (product.getId() == id) {
                    System.out.println("编号：" + product.getId() + "\t单价：" + product.getPrice());
                    break;
                }else if (count == list.size()) {
                    System.out.println("未查询到该商品");
                }
                count++;
            }

            //询问
            System.out.println("是否继续操作(y/n)?");
            String flag = scanner.next();
            if (flag.equals("y"))
                this.searchPrice();
            else
                this.menu();
            System.out.println();
        }
    }

    //显示所有商品
    public void  show(){
        if (list.size() == 0){
            System.out.println("还未添加商品，请先添加！");
            this.menu();
        }else {
            System.out.println(">>> 显示商品");
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = 0; j < list.size() - 1 - i; j++) {
                    if (list.get(j).getPrice() > list.get(j + 1).getPrice()){
                        list.add(j, list.get(j + 1));
                        list.remove(j + 2);
                    }
                }
            }
            for (Product product : list){
                System.out.println(product.toString());
            }
        }
        //询问
        System.out.println("是否继续操作(y/n)?");
        String flag = scanner.next();
        if (flag.equals("y"))
            this.show();
        else
            this.menu();
        System.out.println();
    }

    //按价格搜索商品
    public void searchByPrice(){
        if (list.size() == 0){
            System.out.println("还未添加商品，请先添加！");
            this.menu();
        }else {
            System.out.println(">>> 通过价格查找商品");
            System.out.println("请输入查询商品的价格：");
            float price = scanner.nextFloat();
            int count = 1;
            boolean flag = false;
            for (Product product:list){
                if (product.getPrice() == price){
                    System.out.println(product.toString());
                    flag = true;
                }else if (count == list.size() && flag == false){
                    System.out.println("未查找到该商品");
                }
                count++;
            }
        }
        //询问
        System.out.println("是否继续操作(y/n)?");
        String flag = scanner.next();
        if (flag.equals("y"))
            this.searchByPrice();
        else
            this.menu();
        System.out.println();
    }
}
