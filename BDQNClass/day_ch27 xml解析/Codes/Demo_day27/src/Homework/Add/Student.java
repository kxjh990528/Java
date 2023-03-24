package Homework.Add;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/19 9:59
 * @Java version: 1.8.0_361
 * @Description:使用dom4j解析xml文件
 */
public class Student {
    //使用Java语言解析xml文件
    //使用DOM4J解析xml文件的步骤
    //1.导入DOM4J的第三方jar包
    //4.添加第三方jar包的步骤:
    //4.1.在项目中创建lib目录并将jar包复制到lib目录中.
    //4.2.在jar上右键-->选择 add as library
    //将jar包复制到工程的lib目录中，在包上右键添加到库
    public static void main(String[] args) {
        try {
            //2.创建SaxRead对象读取xml文件
            //创建文件对象(关联xml文件)
            File file =
                    new File("D:\\北大青鸟学习\\Java-U1\\day_ch27 xml解析\\Codes\\Demo_day27\\src\\Homework\\Add\\stulist.xml");
            SAXReader saxReader = new SAXReader();
            Document doc = saxReader.read(file);//Document就是文档
            //3.获取根元素
            Element root = doc.getRootElement();//Element表示元素（标签）对应<stulist>标签

            List<Element> childs = root.elements();
            System.out.println("子元素的个数：" + childs.size());
            System.out.println("学号\t姓名\t年龄\t性别");
            for (Element element: childs) {
                //System.out.println(((Element)element.elements().get(0)).getText());
                //通过字标签的名称获取标签内容
                String name = element.elementText("name");
                String age = element.elementText("age");
                String sex = element.elementText("sex");
                //通过属性的名称获取值
                String idValue = element.attributeValue("id");
                System.out.println(idValue + "\t" + name + "\t" + age + "\t" + sex + "\t");

            }
        }catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
