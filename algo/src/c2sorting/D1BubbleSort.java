package c2sorting;

import java.util.Arrays;

public class D1BubbleSort {
    // 붙어있는 두 원소를 비교하면서
    // 더 큰 원소를 오른쪽으로 옮겨준다.
    public static void bubbleSort(int[] array) {
        // 배열의 크기를 따로 저장한다. (array.length를 많이 사용하기 때문)
        int length = array.length;
        int[] nums = {3, 8, 5, 6, 2, 1};
        // length - 1 만큼 반복한다.
        for (int i = 0; i < length -1 ; i++) {
            // i 번째 반복에서는 뒤에서 i번째 원소는 이미 정렬된 상태
            for (int j = 0; j < length - 1 - i; j++) {
                // j번째 원소와 j + 1번째 원소를 비교해서
                // j번째 원소가 더 크면
                if (array[j] > array[j + 1]) {
                    // 교환하자
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println( "rep " + i + ":"+ Arrays.toString(array));

        }
    }

    public static void main(String[] args) {
        int[] numbers = {36, 12, 18, 15, 41, 19};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
