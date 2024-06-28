package org.sparta.spring240622.assign2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> integerStack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int range = Integer.parseInt(br.readLine());

        for (int i = 0; i < range; i++) {
            String order = br.readLine();
            String[] order2 = order.split(" ");
            switch (order2[0]) {
                case "top": {
                    if (integerStack.isEmpty()) {
                        sb.append("-1\n");

                    } else {
                        sb.append(integerStack.peek() + "\n");
                    }
                    break;
                }
                case "size":
                    sb.append(integerStack.size() + "\n");
                    break;

                case "empty": {
                    if (integerStack.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                }
                case "pop":
                    if (integerStack.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(integerStack.pop() + "\n");
                    }
                    break;
                case "push":
                    integerStack.push(Integer.parseInt(order2[1]));
                    break;
            }
        }
        System.out.println(sb.toString());

    }
}
