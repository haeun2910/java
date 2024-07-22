package prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다.
// 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
//문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을,
// 아니면 0을 return 하는 solution 함수를 작성해 주세요.
public class Q2 {
    public static void main(String[] args)  {

    }
    public int solution(String mystring, String isprefix){
        // isPregix가 myString보다 길면 0을 반환한다.
        if (isprefix.length() > mystring.length())
            return 0;
        // isPrefix의 길이만큼 반복한다.
        for (int i = 0; i < isprefix.length(); i++) {
            // isPrefix의 i번째 글자와
            //myString의 i번째 글자가 동일한지 확인
            // 동일하지 않다면 0을 반환한다.
            if (mystring.charAt(i) != isprefix.charAt(i))
                return 0;
            // 반복문이 정상적으로 종료되면 1을 반환한다.
        }
        return 1;
//        return mystring.startsWith(isprefix) ? 1 : 0;
    }
}
