package c3stack.Prac;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2566
public class Q2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] input = new int[9][9];
        int max = 0;
        int maxRow = -1;
        int maxCol = -1;
//        int[][] max = new int[0][0];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                input[i][j] = sc.nextInt();
                if (input[i][j] > max) {
                    max = input[i][j];
                    maxRow = i;
                    maxCol = j;

                }

            }
        }
        System.out.println(max);
        System.out.println((maxRow + 1) + "," + (maxCol + 1));
    }
}
