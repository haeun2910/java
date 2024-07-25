package prob;

import java.util.Arrays;
// https://school.programmers.co.kr/learn/courses/30/lessons/181916
public class Q181916 {
    public static int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        // 모두 같은 경우
        if (dice[0] == dice[3]) {
            return 1111 * dice[0];
        }

        // 세 개가 같은 경우
        if (dice[0] == dice[2] || dice[1] == dice[3]) {
            int p = dice[1];
            int q = (dice[0] == dice[2]) ? dice[3] : dice[0];
            return (int) Math.pow(10 * p + q, 2);
        }

        // 두 개씩 같은 경우
        if (dice[0] == dice[1] && dice[2] == dice[3]) {
            int p = dice[0];
            int q = dice[2];
            return (p + q) * Math.abs(p - q);
        }

        // 두 개가 같고 나머지 두 개가 다른 경우
        if (dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]) {
            int p = (dice[0] == dice[1]) ? dice[0] : (dice[1] == dice[2]) ? dice[1] : dice[2];
            int q = (dice[0] == dice[1]) ? dice[2] : (dice[1] == dice[2]) ? dice[0] : dice[1];
            int r = dice[3];
            if (dice[2] == dice[3]) {
                r = dice[0];
            }
            return q * r;
        }

        // 모두 다른 경우
        return dice[0];
    }
}
