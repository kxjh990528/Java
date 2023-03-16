package Demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/7 11:14
 * @Java version: 1.8.0_361
 * @Description:上机练习二:分别使用迭代器和foreach语句循环list集合
 */
public class Demo2 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("张三");
        set.add("李四");
        set.add("麻子");
        set.add("张三");//重复会覆盖
        //1.使用迭代器遍历集合的使用步骤
        //1.1创建迭代器对象
        Iterator iterator = set.iterator();
        //1.2 使用迭代器的方法来遍历集合
        //iterator.next();   //下移指针获取当前元素
        //iterator.hasNext();  //判断有没有下一个元素  没有true 反之 false
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //2.使用foreach遍历循环 掌握
        for (Object o:set) {
            //注意：o代表集合的每一个元素
            System.out.println(o);
        }
    }
}
