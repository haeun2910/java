package c3stack.Prac;
// https://school.programmers.co.kr/learn/courses/30/lessons/181934
public class Q181934 {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">") && eq.equals("=")) {
            return n >= m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            return n <= m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            return n > m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("!")) {
            return n < m ? 1 : 0;
        }
        return 0;
    }
}
