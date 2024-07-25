package c3stack.Prac;
// https://school.programmers.co.kr/learn/courses/30/lessons/181936
public class Q181936 {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if (number % n == 0 && number % m == 0) {
            answer = 1;
        }
        return answer;

    }
}
