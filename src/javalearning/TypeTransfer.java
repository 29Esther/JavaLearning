/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning;

/**
 * 八个基本数据类型：boolean, byte, short, int, long
 * @author lzx
 */
public class TypeTransfer {
    
    // 因为系统会默认给浮点数分配double类型
    double PI1 = 3.14;
    // float PI2 = 3.14; // 会报错，不兼容类型，会遗失精度
    float PI3 = 3.14f;
    float PI4 = (float) 3.14;
    
    // 同理，对于整数型数字，系统会默认分配int类型
    // int bigNumber = 2147483648; //会报错，过大整数
    // long bigNumber = 2147483648; //还是会报错，过大整数
    long bigNumber = 2147483648L; // 将大数字指定为Long型
    byte number1 = 10;
    // byte number2 = 128; // 会报错，不兼容类型，会遗失精度
    
    // Promote 自动提升
    // 表达式中包括不同类型数值，运算时以长度最长的类型为主
    int a1 = 10;
    double b1 = a1 * 3.14;
    float c1 = a1 * 3.14f;
    // 操作数都是不大于int的整数，则自动提升为int类型
    short a2 = 2;
    short b2 = 3;
    //short c2 = a2 * b2; // 会报错，不兼容类型，会遗失精度
    
    public static void main (String[] args) {
        /*System.out.println(10/3); // 3 (int)
        System.out.println(10.0/3); // 3.3333333333333335 (double)
        System.out.println(10.0/3.0); // 3.3333333333333335 (double)
        
        System.out.println(0b01111111_111111111_11111111_11111111 + 1); // 0 */
        
        int count1 = 2147483647;
        System.out.println(count1); // 2147483647
        count1 = count1 + 1;
        System.out.println(count1+1); // -2147483648
        
        byte count2 = 127;
        System.out.println(count2); // 2147483647
        // count2 = count2 + 1; //报错
        System.out.println(count2+1); // -2147483648
    }
}
