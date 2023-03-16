package com.hp.demo1;

public class TestHashCode {
    public static void main(String[] args) {
        //创建对象，在内存中的地址是不一样的，是不同的对象
        Student s1 = new Student("张三",18);
        Student s2 = new Student("张三",18);
        // 所以hashCode值是不同的
//        System.out.println(s1.hashCode()); //1060830840
//        System.out.println(s2.hashCode()); //2137211482
        // 重写hashCode方法之后， 获取hashCode值一样
        System.out.println(s1.hashCode()); //24021577
        System.out.println(s2.hashCode()); //24021577
    }
}
