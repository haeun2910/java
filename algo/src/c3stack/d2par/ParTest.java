package c3stack.d2par;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParTest {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(test(reader.readLine()));
    }
    // line이라는 매개변수가 괄호로 이줘져 있다고 할 때
    // line의 괄호가 정상적으로 매칭이 되는지
    private static boolean test(String line){
        // Java 의 Stack
        Stack<Character> parStack = new Stack<>();

        // line의 각 글자를 확인한다
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            // 만약 글자가 '('라면
                // 스택에 푸시한다.
            if (letter == '(') {
                parStack.push(letter);
                // 만약 글자가 ')'라면
                // 스택이 비어있다면 false
            } else if (letter == ')') {
                if (parStack.empty()) return false;
                    // 아니라면 스택에서 팝한다.
                char top = parStack.pop();
                if (top != '(') return false;
            }


        }
             // 스택이 비어있으면 true, 아니면 false
        return parStack.isEmpty();
    }
}
