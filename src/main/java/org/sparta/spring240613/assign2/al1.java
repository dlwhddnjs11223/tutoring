package org.sparta.spring240613.assign2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class al1 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 1;
//
//
//        Stack<Integer> stack = new Stack<>();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < n; i++) {
//            int data = sc.nextInt();
//            while (count <= data) {
//                stack.push(count);
//                count++;
//                sb.append("+\n");
//            }
//            if (stack.peek() == data) {
//                stack.pop();
//                sb.append("-\n");
//            } else {
//                System.out.println("NO");
//                return;
//            }
//        }
//        System.out.println(sb.toString());
//        sc.close();
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Queue<Document> queue = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                int priority = sc.nextInt();
                queue.add(new Document(priority, j));
            }

            int count = 0;
            while (true) {
                Document current = queue.peek();
                //queue 안에 최근 문서보다 더 높은 우선순위가 있을 경우, true 반환
                boolean hasHigherPriority = queue.stream().anyMatch(doc -> doc.priority > current.priority);
                if (hasHigherPriority) {
                    // 가장 앞에 있는 값을 뒤로 옮긴다.
                    queue.add(queue.poll());
                } else {
                    Document printed = queue.poll();
                    count++;
                    //우리가 찾던 문서의 인덱스가 일치할 경우
                    if (printed.index == m) {
                        System.out.println(count);
                        break;
                    }
                }
            }
        }
        sc.close();
    }


}

class Document {
    int priority;
    int index;

    public Document(int priority, int index) {
        this.priority = priority;
        this.index = index;
    }
}