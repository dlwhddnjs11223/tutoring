package org.sparta.spring240613.assign2;

import java.util.Scanner;
import java.util.Stack;

public class al3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String data = sc.nextLine();
            Stack<Character> leftStack = new Stack<>();
            Stack<Character> rightStack = new Stack<>();
            for (char charData : data.toCharArray()) {
                switch (charData) {
                    case '-':
                        if (!leftStack.isEmpty())
                            leftStack.pop();
                        break;

                    case '<':
                        if (!leftStack.isEmpty())
                            rightStack.push(leftStack.pop());
                        break;
                    case '>':
                        if (!rightStack.isEmpty())

                            leftStack.push(rightStack.pop());
                        break;
                    default:
                        leftStack.push(charData);
                        break;
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!leftStack.isEmpty()) {
                rightStack.push(leftStack.pop());
            }
            while (!rightStack.isEmpty()) {
                sb.append(rightStack.pop());
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
