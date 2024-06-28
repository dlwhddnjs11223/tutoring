package org.sparta.spring240628.assign3;

import java.util.*;
/*
시간 초과로 인해 통과 못함
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> answerList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int count = 0;

        for (int i = 0; i < range; i++) {
            intList.add(sc.nextInt());
        }
        while (count < intList.size()) {
            int currentNumber = intList.get(0);
            intList.remove(0);
            intList.add(0);

            for (int j = 0; j < intList.size(); j++) {
                int maxNumber = intList.stream().max(Comparator.naturalOrder()).orElse(0);
                if(currentNumber>maxNumber){
                    answerList.add(-1);
                    break;
                }
                int nextNumber = intList.get(j);

                if (nextNumber > currentNumber) {
                    Integer answer = nextNumber;

                    answerList.add(nextNumber);
                    break;
                }

            }
            count++;
        }
        answerList.stream().forEach(number -> System.out.print(number+" "));
    }
}
