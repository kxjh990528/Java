package Homework.Student;

import javax.lang.model.element.NestingKind;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/9 15:25
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Student {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("xh",101);
        map.put("name","张三");
        map.put("age",21);
        map.put("address","湖北武汉");

        System.out.println("foreach语句遍历");
        // 使用foreach语句遍历
        for (Object key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println();
        System.out.println("集合的foreach方法显示");
        // 使用Map的forEach()方法
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
