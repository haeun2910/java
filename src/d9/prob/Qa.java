package d9.prob;

import java.util.Arrays;
import java.util.OptionalDouble;

/*
정수 배열을 인자로 받아,
 음수가 아닌 숫자 중 짝수인 숫자들의 평균을 구하는 메서드를,
  Stream API를 활용해 작성하시오.

 */
public class Qa {
    public static void main(String[] args) {
//        System.out.println((evenAverage(new int[]{1,3,5,7,9})));
        System.out.println((evenAverage(new int[]{20, 21, 22, 23, 24, 25, 26, 27})));
    }
    public static Double evenAverage(int[] numbers){
//        return Arrays.stream(numbers)
//                .filter(i -> i >=0)
//                .filter(i -> i % 2 == 0)
//                .average().getAsDouble();
        // Stream을 만든다
        return Arrays.stream((numbers))
                // filter를 이용해서 조건에 맞는 데이터만 남긴다.
                .filter(i -> !(i < 0) && i % 2 == 0)
                // 정수 Stream이니까 avarage() 호출
                .average()
                // Optional이기 때문애 orElse까지
                .orElse(0.0);
    }

}
