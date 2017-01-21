/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning;

/**
 * 左移的次方运算, 右移2的降幂运算
 * @author lzx
 */
public class Shift {
    public static void main(String[] Args) {
        int number = 1;
        System.out.println(number); //2^0
        
        number = number << 1;
        System.out.println(number); //2^1
        
        number = number << 1;
        System.out.println(number); //2^2
        
        number = number << 1;
        System.out.println(number); //2^3
        
        int bigNum = 1024;
        System.out.println(bigNum);
        
        bigNum = bigNum >> 1;
        System.out.println(bigNum);
        
        bigNum = bigNum >> 1;
        System.out.println(bigNum);
        
        bigNum = bigNum >> 1;
        System.out.println(bigNum);
    }
}
