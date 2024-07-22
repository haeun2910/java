package prob;

import java.util.Arrays;

public class Q8181931 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean[] included = {true, false, false, true, true};
        System.out.println(solution(a,b,included));
    }


    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a;
            }
            a += d;
        }
        return answer;

    }
}
