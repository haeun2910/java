package c4Queue.Prac;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181920
public class Q181920 {
    public List<Integer> solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            answer.add(i);
        }
        return answer;
    }
}
