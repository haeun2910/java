package c4Queue.Prac;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/10809
public class Q10809 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String target = reader.readLine();
        int[] array = new int[26];
        Arrays.fill(array, -1);
//        System.out.println(Arrays.toString(array));
        // 일단 각 글자를 0번째 부터 마지막 글자까지 살펴보는데
        for (int i = 0; i < target.length(); i++) {
            // 글자가 'b'라면 그 글자는 'b' - 'a' 번째 글자이다.
            int index = target.charAt(i) - 'a';
            // 해당하는 array[index]의 값이 -1이면
            // i를 새로 넣어준다.
            if (array[index] == -1) {
                array[index] = i;
            }

        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            answer.append(array[i]);
            answer.append(" ");
        }
        System.out.println(answer);



    }
}
