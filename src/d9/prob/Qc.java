package d9.prob;
/*
Java의 String은 각 문자를 int로 취급한 Stream을 반환하는 chars() 메서드가 있다.

이 메서드를 활용하여, 인자로 전달된 문자열의 각 글자마다

1. 글자가 숫자(0 ~ 9)면 해당 숫자,
2. 글자가 문자(A ~ Z, a ~ z)면 1
3. 그 외에는 -1

이라고 생각하고, 모든 문자의 값을 곱한 결과를 반환하는 메서드를, Stream API를 활용해 작성하시오.

예시:

jeeho@1234
-> 1, 1, 1, 1, 1, -1, 1, 2, 3, 4
-> -24
 */
public class Qc {
    public static void main(String[] args) {
        System.out.println(numberArrays("jeeho@1234"));
    }
    public static int numberArrays (String input){
//        return input.chars()
//                .map(i ->{
//                    if (Character.isDigit(i)){
//                        return Character.getNumericValue(i);
//                    } else if (Character.isLetter(i)) {
//                        return 1;
//                    }
//                    else {
//                        return -1;
//                    }
//                })
//                .reduce(1, (a,b) -> a*b);
        return input.chars()
                .map(i -> {
                    if (Character.isDigit((char)i)) return i - '0';
                    if (Character.isLetter((char)i)) return 1;
                    return -1;
                })
                // 1 부터 시작한 다음,
                // 이전 값들의 계산 경과를 total에,
                // 이번 데이터를 now에 인자로 전달한 다음
                // total * now를 반환하여 다음 total로 사용
                .reduce(1, (total,now) -> total * now);

    }
}
