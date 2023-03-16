package Demo;

import java.util.ArrayList;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/7 10:07
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class Demo1 {
    /*上机练习一:使用ArrayList集合 存储多名学生信息
‘1.创建集合对象
2.添加元素--获取长度--获取某个元素--循环显示所有
            测试一个删除元素,判断某元素是否存在*/
    public static void main(String[] args) {
        //用ArrayList集合存放多个学生姓名
        //创建集合对象
        ArrayList arrayList = new ArrayList();
        //2.使用集合对象的方法操作集合
        //2.1 添加元素
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("麻子");
        //arrayList.add(1, "豪哥");
        //2.2获取集合长度
        System.out.println(arrayList.size());
        //2.3获取某个元素  索引位置从0开始
        //System.out.println(list.get(0));
        //2.5删除集合中某元素
        //list.remove("李四");  //按内容删除
        arrayList.remove(1); //按位置删除
        //2.6判断某个元素在集合中是否出现   存在返回true,反之false
        if(arrayList.contains("涛哥")){
            System.out.println("存在");
        }else{
            System.out.println("不存在");
        }

        //2.4获取所有元素
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
