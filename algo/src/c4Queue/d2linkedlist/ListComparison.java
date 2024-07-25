package c4Queue.d2linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    public static void main(String[] args) {
        // ArrayList 와 LinkedList를 비교해보자
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        rearInsert(arrayList);
        rearInsert(linkedList);

        frontInsert(arrayList);
        frontInsert(linkedList);

        getElements(arrayList);
        getElements(linkedList);

    }

    // 1. List의 뒤쪽에 데이터 100000개 넣기
    public static void rearInsert(List<String> list) {
        // 시작 시간 기록
        long start = System.nanoTime();
        // 100000번 반복해서 데이터 넣기
        for (int i = 0; i < 100000; i++) {
            list.add( "hello");
        }
        // 종료 시간 기록
        long end = System.nanoTime();
        System.out.println(String.format("소요시간: %15d ns",end - start));
    }

    // 2. List의 앞쪽에 데이터 100000개 넣기
    public static void frontInsert(List<String> list) {
        // 시작 시간 기록
        long start = System.nanoTime();
        // 100000번 반복해서 데이터 넣기
        for (int i = 0; i < 100000; i++) {
            list.add(0, "hello");
        }
        // 종료 시간 기록
        long end = System.nanoTime();
        System.out.println(String.format("소요시간: %15d ns",end - start));
    }

    // 3. List의 데이터 순차적으로 조회(get)
    public static void getElements(List<String> list) {
        // 시작 시간 기록
        long start = System.nanoTime();
        // 100000번 반복해서 데이터 넣기
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        // 종료 시간 기록
        long end = System.nanoTime();
        System.out.println(String.format("소요시간: %15d ns",end - start));
    }

}
