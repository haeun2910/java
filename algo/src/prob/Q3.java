package prob;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
//체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다.
// 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
//체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오
// https://www.acmicpc.net/problem/3003
public class Q3 {
    public static void main(String[] args) throws IOException {
        // 한중의 문자열을 입력받고
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        // 공백 기준으로 문자열을 나눈 다음
        String[] tokens = line.split(" ");
        int[] pieces = new int[6];
        // 각각 문자를 반복해서
        for (int i = 0; i < tokens.length; i++) {
            // 정수로 바꾸어서 저장한다.
            pieces[i] = Integer.parseInt(tokens[i]);
        }
        // 기준 숫자 목록과 각각 비교해서 1 1 2 2 2 8
        int[] baseCount = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < baseCount.length; i++) {
            // 자이를 기록한다.
            baseCount[i] -= pieces[i];
        }

        //결과를 정리하여 출력한다
        System.out.println(String.format(
                "%d %d %d %d %d %d",
                baseCount[0],
                baseCount[1],
                baseCount[2],
                baseCount[3],
                baseCount[4],
                baseCount[5]
        ));


    }
}
