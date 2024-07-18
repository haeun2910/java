package d9.prob;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
Java의 String은 각 문자를 int로 취급한 Stream을 반환하는 chars() 메서드가 있다.

이 메서드를 활용하여, 인자로 전달된 문자열의 각 문자가 전부 숫자인지 판단하는 메서드를,
 Stream API를 활용해 작성하시오.
 */
public class Q2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        IntStream charStream = scanner.nextLine().chars();
//        System.out.println(charStream.allMatch(Character::isDigit));
        System.out.println(isDigit("123123123123123"));
        System.out.println(isDigit("123"));
        System.out.println(isDigit("12asdvfas"));
    }
    public static boolean isDigit(String word){
//        return word.chars()
//                // 각 문자애소 '0'에 해당하는 ASCII 코드를 뺀다
//                .map(c -> c - '0')
//                // 그렇다면 남은 데이터가 0 <= data <= 9이면 숫자 문자였다.
//                .allMatch(data -> data >= 0 && data <= 9);
        return word.chars().allMatch(c -> c - '0' >= 0 && c - '0' <= 9);
    }
}
