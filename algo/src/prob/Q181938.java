package prob;

// https://school.programmers.co.kr/learn/courses/30/lessons/181938
public class Q181938 {
    public int solution(int a, int b) {
        int answer = 0;
        int aNhanBNhan2 = 2 * a * b;
        int result = Integer.parseInt("" + a + b);
        if(aNhanBNhan2 < result) {
            answer = result;
            return answer;
        }else {
            answer = aNhanBNhan2;
            return answer;
        }
    }
}
