package org.sparta.spring240628.assign2;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void test1() {
        int k = 10;
        int[] a = {1, 3, 5, 4, 0, 0, 7, 0, 0, 6};

        Stack<Integer> jangbu = new Stack<>();

        for (int i = 0; i < k; i++) {
            if (a[i] > 0) {
                jangbu.push(a[i]);
            } else {
                jangbu.pop();
            }
        }
        int answer = 0;
        for (int number : jangbu) {
            answer += number;
        }

        System.out.println(answer);
    }


    @Test
    void test2() {
        int count = 0;

        List<Integer> answerList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>(Arrays.asList(9, 5, 4, 8));

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


//  for(int i = 0; i<intList.size(); i++){
//
//        for(int j= i+1; j<intList.size(); j++){
//int nextNumber = intList.get(j);
//int currentNumber = intList.get(i);
//            if(nextNumber>currentNumber){
//        intList.add(nextNumber);
//            }
//                    }
//                    }