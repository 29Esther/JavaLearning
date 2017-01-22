package Chapter4;

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
 * 介绍两个标准类：
 */
public class Object {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}
