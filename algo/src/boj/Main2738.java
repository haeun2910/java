package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// https://www.acmicpc.net/problem/2738
public class Main2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split(" ");
        // 첫번째 줄 입력을 N과 M으로 Parse
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        // 향렬의 크기를 바탕으로 2차원 배열을 만든다.
        // a행열
        int[][] a = new int[n][m];
        // b 행열
        int[][] b = new int[n][m];
        // 합한 결과 행렬
        int[][] result = new int[n][m];

        // n만큼 반복하면서
        for (int i = 0; i < n; i++) {
            // 문자열을 입력받고
            // 문자열을 해석해서 정수 배열로 만든 다음
            tokens = reader.readLine().split(" ");
            int[] row = a[i];
            for (int j = 0; j < m; j++) {
                row[j] = Integer.parseInt(tokens[j]);
            }
//            int[] nums = new int[m];
//            for (int j = 0; j < m; j++) {
//                nums[j] = Integer.parseInt(tokens[j]);
//            }
//            // a의 i뻔재 줄을 받아오고
//            int[] row = a[i];
//            for (int j = 0; j < m; j++) {
//                // a의 i번째 줄의 i번째에 잘 할당해준다
//                row[j] = nums[j];
        }
        // 앞선 과정을 반복한다.
        for (int i = 0; i < n; i++) {
            tokens = reader.readLine().split(" ");
            int[] row = b[i];
            for (int j = 0; j < m; j++) {
                row[j] = Integer.parseInt(tokens[j]);
            }
        }

        // 두배열의 각 칸을 확인해가며
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = a[i][j] + b[i][j];

            }
        }
        // 결과를 출력하기 위해 준비한다.
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            // result의
            for (int j = 0; j < m; j++) {
                // [i][j]를 문자열에 추가
                answer.append(result[i][j]).append(" ");
            }

            // 한줄 추가
            answer.append("\n");
        }
        System.out.println(answer);
    }
}

