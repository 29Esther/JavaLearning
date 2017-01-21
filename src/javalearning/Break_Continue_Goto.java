/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning;

/**
 *
 * | Key      | Scope                         | Function                              |
 * |----------|-------------------------------|---------------------------------------|
 * | break    | switch, for, while, do..while | 中断当前循环、跳出当前区块                 |
 * | continue | for, while, do..while         | 略过此次循环之后的描述句,进入此区块的下一循环 |
 * |          |                               |                                       |
 *
 * 它们还可以配合标签，有神奇效果，但不推荐使用
 * @author lzx
 */
public class Break_Continue_Goto {
    
    public static void main (String[] args) {
        kevin : 
            for (int i = 2; i < 5; i++) {
                if ( i == 3) {
                    continue kevin; // 2 4
                }
                System.out.println(i);
            }
            System.out.println("Test");
            
        esther : {
            for (int i = 2; i < 5; i++) {
                if ( i == 3) {
                    break esther; //2
                }
                System.out.println(i);
            }
            System.out.println("Test");
        }
    }
    
    
}
