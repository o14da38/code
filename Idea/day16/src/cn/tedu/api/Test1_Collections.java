package cn.tedu.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//测试Collections工具类 -- 为集合提供各种方法
public class Test1_Collections {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(2);
        list1.add(3);
        list1.add(7);
        System.out.println(list1);
        //addAll(m,n)  m是集合名称，n可以有多个，用逗号隔开
        Collections.addAll(list1,928,231);
        System.out.println(Collections.max(list1));//集合最大值
        System.out.println(Collections.min(list1));//集合最小值
        Collections.replaceAll(list1,2,22);//替换
        System.out.println(list1);
        Collections.reverse(list1);//反转
        System.out.println(list1);
    }
}
