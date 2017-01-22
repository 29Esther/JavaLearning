/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning;

/**
 * 1. 求1000, 495的最大公约数
 * 2. 阿姆斯特朗数：153满足1^3+5^3+3^3 = 153
 * @author lzx
 */
public class Chapter1Exercise {
    public static void main(String[] args) {
        // 1
        int m = 1000, n = 495;
        int answer = gcd(m, n);
        // System.out.println(answer);
        
        // 2
        ams();
    }
    
    public static int gcd(int m, int n) {
        int a = Math.abs(m - n), b = Math.min(m, n), answer = 1, a1 = 0;
        boolean flag = true;
        do {
            if (a == 0) {
                answer = b * answer;
                flag = false;
                break;
            } 
            if (b == 0) {
                answer = a * answer;
                flag = false;
                break;
            }
            if (a%2 == 0 && b%2 == 0) {
                a = a>>1;
                b = b>>1;
                answer = 2 * answer;
                continue;
            }
            if (a%2 == 0) {
                a = a>>1;
                continue;
            }
            if (b%2 == 0) {
                b = b>>1;
                continue;
            }
            a1 = Math.abs(a - b);
            b = Math.min(a, b);
            a = a1;
        } while (flag);
        
        return answer;
    }
    
    public static void ams() {
        for (int i = 1; i <= 9; i ++) {
            for (int j = 1; j <= 9; j ++){
                for (int q = 1; q <= 9; q ++) {
                    if (Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(q, 3) == 100 * i + 10 * j + q) {
                        System.out.println(100 * i + 10 * j + q);
                    }
                }
            }
            
        }
    }
}
