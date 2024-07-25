package prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q181894 {
    public static int[] solution(int[] arr) {
        List<Integer> indicesOf2 = new ArrayList<>();

        // 2의 인덱스를 저장
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                indicesOf2.add(i);
            }
        }

        // 2가 없는 경우 [-1] 반환
        if (indicesOf2.isEmpty()) {
            return new int[]{-1};
        }

        // 첫 번째와 마지막 2의 인덱스를 구한다
        int start = indicesOf2.get(0);
        int end = indicesOf2.get(indicesOf2.size() - 1);

        // 해당 범위의 부분 배열 반환
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
