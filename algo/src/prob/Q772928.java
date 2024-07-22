package prob;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/172928
public class Q772928 {
    public static void main(String[] args) {
        // y 따로 x 따로 저장하는 방법
        int[] deltaY = {-1, 1, 0, 0};
        int[] deltaX = {0, 0, -1, 1};
        int[] me = {2, 3};
        for (int i = 0; i < 4; i++) {
            int[] now = {
                    me[0] + deltaY[i],
                    me[1] + deltaX[i]
            };
            System.out.println(Arrays.toString(now));
        }
    }
}
