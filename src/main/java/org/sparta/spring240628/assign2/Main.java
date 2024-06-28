package org.sparta.spring240628.assign2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int k = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
           int a = sc.nextInt();
            if (a > 0) {
                stack.push(a);
            } else {
                stack.pop();
            }
        }
        for(int number : stack){
            answer += number;
        }
        System.out.println(answer);
    }
}
