package prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 정수가 담긴 리스트 num_list가 주어질 때,
// 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을
// return하도록 solution 함수를 완성해주세요.
//입출력 예 #1
//모든 원소의 곱은 120, 합의 제곱은 225이므로 1을 return합니다.
//입출력 예 #2
//모든 원소의 곱은 840, 합의 제곱은 529이므로 0을 return합니다.
public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] lineArray = line.split(",");
        int[] num_list = Arrays.stream(lineArray).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        int product = 1;
        int sum = 0;
        for (int i = 0; i < num_list.length; i++) {
            product *= num_list[i];
            sum += num_list[i];
        }

        int sumSquare = sum * sum;
        if (product < sumSquare) {
            answer = 1;
        }else {
            answer = 0;
        }
        System.out.println(answer);
    }
}
