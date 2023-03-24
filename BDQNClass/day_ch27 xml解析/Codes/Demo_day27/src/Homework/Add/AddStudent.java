package Homework.Add;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


import java.io.*;
import java.util.Scanner;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/19 14:57
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class AddStudent {
    /**
     * 把Document对象写入XML文件
     */
    private static void writeToFile(Document document, String fileName) throws IOException {
        // 创建输出格式对象
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");

        // 创建XMLWriter对象
        FileWriter fileWriter = new FileWriter(fileName);
        XMLWriter writer = new XMLWriter(fileWriter, format);

        // 写入Document对象
        writer.write(document);

        // 关闭XMLWriter对象
        writer.close();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            SAXReader saxReader = new SAXReader();
            Document read =
                    saxReader.read(new File("D:\\北大青鸟学习\\Java-U1\\day_ch27 xml解析\\Codes\\Demo_day27\\src\\Homework\\Add\\stulist.xml"));
            //获取根节点
            Element rootElement = read.getRootElement();

            //创建子节点
            Element stu = rootElement.addElement("stu");
            System.out.println("请输入学号：");
            stu.setAttributeValue("id", Integer.toString(scanner.nextInt()));
            System.out.println("请输入姓名：");
            Element name = stu.addElement("name");
            name.setText(scanner.next());
            System.out.println("请输入年龄：");
            Element age = stu.addElement("age");
            age.setText(Integer.toString(scanner.nextInt()));
            System.out.println("请输入性别：");
            Element sex = stu.addElement("sex");
            sex.setText(scanner.next());

            writeToFile(read, "D:\\北大青鸟学习\\Java-U1\\day_ch27 xml解析\\Codes\\Demo_day27\\src\\Homework\\Add\\stulist.xml");
            System.out.println("写入成功！");
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
