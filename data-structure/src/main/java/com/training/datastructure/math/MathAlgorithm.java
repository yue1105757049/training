package com.training.datastructure.math;

import java.util.Stack;

/**
 * @User: wong
 * @Date: 2020/6/29
 * @Description: 数学公式
 */
public class MathAlgorithm {

  public static void main(String[] args) {
    System.out.println("Catalan(3) = " + catalan(4));
    System.out.println(convert(88, 2));
    System.out.println("1-100:" + as(1, 1, 100));
    System.out.println("1-100:" + gauss(1, 100, 100));
  }


  /**
   * Catalan数
   * 公式：(2n)! / ((n+1)! * n!)
   */
  public static int catalan(int n) {
    return factorial(2 * n) / factorial(n + 1) / factorial(n);
  }


  /**
   * 阶乘 (全排列)
   * 一个正整数的阶乘（factorial）是所有小于及等于该数的正整数的积，并且0的阶乘为1。自然数n的阶乘写作n!
   */
  public static int factorial(int n) {
    if (n <= 1)
      return 1;
    int sum = 1;
    for (int i = 1; i <= n; i++) {
      sum *= i;
    }
    return sum;
  }


  /**
   * 进制转换
   *
   * @param old  需转换的数
   * @param base 转换为的进制
   */
  public static String convert(int old, int base) {
    char[] digit = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    Stack<Character> stack = new Stack<>();
    while (old > 0) {
      stack.push(digit[old % base]);
      old /= base;
    }
    StringBuffer sb = new StringBuffer();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }
    return sb.toString();
  }

  // 求和

  /**
   * 高斯求和公式
   * S =  (f + l) * n / 2
   *
   * @param f 首项
   * @param l 尾项
   * @param n 项数
   * @return
   */
  public static int gauss(int f, int l, int n) {
    return (f + l) * n / 2;
  }

  /**
   * 等差数列求和
   * Sn = n*a1 + d*n*(n-1) / 2
   *
   * @param a 首项
   * @param d 差
   * @param n 尾项
   */
  public static int as(int a, int d, int n) {
    return n * a + d * n * (n - 1) / 2;
  }

}
