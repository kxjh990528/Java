package Demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/9 9:40
 * @Java version: 1.8.0_361
 * @Description:上机练习:使用map集合存多个银行名称信息 要求存代码和值
 *  要求1:
 *    添加元素---获取长度---获取某个值---循环显示所有（显示键和值）----删除某个元素
 **/
public class Demo1 {
    public static void main(String[] args) {
       //1.创建map集合   注意:键不能重复
        Map<String, String> map = new HashMap<>();
        //2.使用方法
        //2.1添加元素
        map.put("ICBC", "中国工商银行");
        map.put("ABC", "中国农业银行");
        map.put("CCB", "中国建设银行");
        map.put("BOC", "中国银行");
        //map.put("CCB", "中国建设银行"); //重复值会替换
        //2.2获取长度
        System.out.println("长度：" + map.size());
        //2.3获取元素
        System.out.println("获取元素：" + map.get("ICBC"));
        //2.5删除元素
        map.remove("BOC");
        //2.6 判断元素是否存在
        System.out.println("判断键是否存在：" + map.containsKey("BOC"));
        System.out.println("判断值是否存在："+ map.containsValue("中国农业银行"));
        //2.4获取所有
        //maps.keySet();  //获取所有的键的集合
        //maps.values();  //获取所有的值的集合
        for (String key:map.keySet()) {
            System.out.println("键是：" + key + "===值：" + map.get(key));
        }
        /*for (String val:maps.values()) {
            System.out.println("值:"+val);
        }*/

        //使用map的foreach循合
        //使用foreach方法
        map.forEach((key, value) -> {
            System.out.println("键：" + key + "\t值：" + value);
        });
    }
}
