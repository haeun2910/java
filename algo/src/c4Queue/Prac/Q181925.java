package c4Queue.Prac;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181925
public class Q181925 {
    public String solution(int[] numLog) {
        StringBuilder br = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];
            if (diff == 1 ) {
                br.append("w");
            }else if (diff == -1){
                br.append("s");
            } else if (diff == 10) {
                br.append("d");
            }else if (diff == -10) {
                br.append("a");
            }

        }
        return br.toString();

    }
}
