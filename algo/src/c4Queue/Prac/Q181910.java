package c4Queue.Prac;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/181910
public class Q181910 {
    public String solution(String my_string, int n) {
        char[] chars = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = chars.length -n; i < chars.length; i++){
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Q181910().solution("abcaasdfa", 3));
    }
}
