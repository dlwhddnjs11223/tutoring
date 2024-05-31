package org.sparta.spring240519.assignment0531.as3;

import java.nio.channels.IllegalChannelGroupException;
import java.util.List;

public class algorhythm {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] n = new int[]{1, 2, 3, 5, 4, 6, 7, 8};
        System.out.println(solution.solution(n));



    }


}

class Solution {
    public String solution(int[] n) {
        if (n[0] == 1 && checkAscending(n)) {
            return "ascending";
        }
        if (n[0] == 8 && !checkAscending(n)) {
            return "descending";
        }
        return "mixed";
    }

    public boolean checkAscending(int[] n) {
        for (int i = 0; i < n.length-1; i++) {
            if (n[i] > n[i + 1]) {
                return false;
            }
        }
        return true;
    }
}


class Solution2 {
    public int solution2(List<Integer> n, int[] m) {
    m = new int[n.size()];



        for(int i = 0; j < m[i]; j++){}

    }

    }
}