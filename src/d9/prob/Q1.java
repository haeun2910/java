package d9.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
정수 배열을 인자로 받아,
각 숫자를 제곱한 수들의 합을 구하는 메서드를,
 Stream API를 활용해 작성하시오.
 */
public class Q1 {
    public static void main(String[] args) {
//    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//    int[] arr = list.stream().mapToInt(i -> i * i).toArray();
//    System.out.println(Arrays.stream(arr).sum());
        System.out.println(sumOfSquares(new int[]{1, 2, 3, 4, 5}));
        System.out.println(sumOfSquares(new int[]{-2,-4, 6}));
    }
    public static int sumOfSquares(int[] numbers) {
//        int sum = 0;
//        for (int num : numbers) {
//            sum += num * num;
//        }
//        IntStream numStream = Arrays.stream(numbers);
//        IntStream numStream2 = numStream.map(i -> i * i);
//        return numStream2.sum();
        return Arrays.stream(numbers)
                .map(i -> i * i)
                .sum();
//        return Arrays.stream(numbers)
//                .reduce(0, (prev, now) -> prev + now * now);
    }
}
