package Chapter4;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 1. 类和对象
 * 2. 标准类
 * @author lzx
 */

/**
 * 类是对象的设计图，对象是类的实现
 * 一个.java文件中可以有多个class，但只能有一个public的，且名称与文件名相同
 * 与类同名的方法是构造函数
 */
class Clothes {
    String color;
    int price;
    Clothes(String color, int price) {
        this.color = color;
        this.price = price;
    }
}

/**
 * 介绍两个标准类：Scanner, 
 */
public class Object {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);
        
        BigDecimal a = new BigDecimal("0.3");
        BigDecimal b = new BigDecimal("0.3");
        BigDecimal c = a;
        BigDecimal summary = a.add(b).add(c);
        System.out.println(summary);
        System.out.println(summary.equals("0.9")); // false
        System.out.println(summary.equals(0.9)); // false
        System.out.println(summary.equals(new BigDecimal("0.9"))); // true
        /*
         * | 对象    | = 的作用             | == 的作用                   |
         * |--------|---------------------|---------------------------|
         * | 基本类型 | 赋值                 | 比较两个变量存储的值是否相同    |
         * | 操作对象 | 指定参考名称参考某个对象 | 比较两个参考名称是否参考同一对象 |
         * |        |                     |                           |
         */
        System.out.println(a == b); // false
        System.out.println(a == c); // true
    }
}
