package prob;

import java.util.ArrayList;
import java.util.Arrays;
// https://school.programmers.co.kr/learn/courses/30/lessons/181886
public class Q181886 {
//    public static void main(String[] args) {
//        String[] names = {"쩐", "B", "C", "D", "E", "hanh", "G", "H"};
//        System.out.println(Arrays.toString(solution(names)));
//    }
//    public static String[] solution(String[] names) {
//        ArrayList<String> list = new ArrayList();
//        int idx = 1;
//        for (int i = 0; i < names.length; i++) {
//            if(i % 5 == 0) {
//                list.add(names[i]);
//            }
//        }
//        String[] answer = new String[list.size()];
//
//        for (int i = 0; i < list.size(); i++) {
//            answer[i] = list.get(i);
//        }
//
//        return answer;
//    }

    public String[] solution(String[] names){
        int arrLen = names.length / 5;
        if (names.length % 5 != 0) arrLen++;
        String[] answer = new String[arrLen];
        for (int i = 0; i < names.length; i+= 5) {
            // i == 0, 5,10,15,..
            answer[i/5] = names[i];
        }
        return answer;
    }
}
