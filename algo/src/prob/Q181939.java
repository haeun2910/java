package prob;

// https://school.programmers.co.kr/learn/courses/30/lessons/181939
public class Q181939 {
    public int solution(int a, int b) {
        // 문자열 더하기
        String resultAStr = "" + a + b;
        int answer = 0;
        int resultA = Integer.parseInt(resultAStr);
        String resultBStr = "" + b + a;
        int resultB = Integer.parseInt(resultBStr);
        answer = Math.max(resultA, resultB);
       // answer = resultA > resultB ? resultA : resultB;


        return answer;
    }
    public static void main(String[] args) {
        System.out.println(new Q181939().solution(9, 91));
    }
}

    

