package org.sparta.spring240622.assign2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> integerStack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int range = Integer.parseInt(br.readLine());

        for (int i = 0; i < range; i++) {
            String order = br.readLine();
            String[] order2 = order.split("\\s");
            switch (order2[0]) {
                case "top" -> {
                    if (integerStack.isEmpty()) {
                        sb.append(-1 + "\n");
                        continue;
                    }
                    sb.append(integerStack.peek() + "\n");
                }
                case "size" -> sb.append(integerStack.size() + "\n");
                case "emtpy" -> {
                    if (integerStack.isEmpty()) {
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                }
                case "pop" -> {
                    if (integerStack.isEmpty()) {
                        sb.append(-1 + "\n");
                        continue;
                    }
                    sb.append(integerStack.pop() + "\n");
                }

                case "push" -> integerStack.push(Integer.parseInt(order2[1]));
            }
        }
        System.out.println(sb.toString());

    }
}
