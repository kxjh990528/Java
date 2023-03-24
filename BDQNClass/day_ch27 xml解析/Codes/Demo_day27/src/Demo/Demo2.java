package Demo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/19 12:12
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo2 {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\北大青鸟学习\\Java-U1\\day_ch27 xml解析\\Codes\\Demo_day27\\src\\Demo\\stulist.xml");
            SAXReader saxReader = new SAXReader();
            Document read = saxReader.read(file);
            Element rootElement = read.getRootElement();
            System.out.println("元素名字：" + rootElement.getName());
            System.out.println("元素内容：" + rootElement.getText());
            List<Element> childElements = rootElement.elements();
            System.out.println("子元素个数：" + childElements.size());
            System.out.println("学号\t姓名\t年龄\t性别");
            for (Element childs:childElements) {
                //System.out.println(((Element)childs.elements().get(0)).getText());
                String name = childs.elementText("name");
                String age = childs.elementText("age");
                String sex = childs.elementText("sex");

            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
