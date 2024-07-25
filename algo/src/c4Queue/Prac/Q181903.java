package c4Queue.Prac;

// https://school.programmers.co.kr/learn/courses/30/lessons/181903
public class Q181903 {
    public String solution(int q, int r, String code) {
        char[] chars = code.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = r; i < chars.length; i+= q) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

}
