package Homework.Clothes;

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
public class Clothes {
    public static void main(String[] args) {
        try {
            File file =
                    new File("D:\\北大青鸟学习\\Java-U1\\day_ch27 xml解析\\Codes" +
                            "\\Demo_day27\\src\\Homework\\Clothes\\Clothes.xml");
            SAXReader saxReader = new SAXReader();
            Document read = saxReader.read(file);
            Element rootElement = read.getRootElement();
            List<Element> elements = rootElement.elements();
            System.out.println("衣服型号\t对应身高");
            for (Element e:elements) {
                String height = e.elementText("height");
                String size = e.attributeValue("size");
                System.out.println(size + "\t\t" + height);
            }
        }catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
