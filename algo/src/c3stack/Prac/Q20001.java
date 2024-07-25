package c3stack.Prac;

import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/20001
public class Q20001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String start = sc.nextLine();
        while (true){
            String command = sc.nextLine();
            if (command.equals("고무오리 디버깅 끝")){
                break;
            } else if (command.equals("문제")) {
                stack.push("문제");
                
            } else if (command.equals("고무오리")) {
                if (stack.isEmpty()) {
                    stack.push("문제");
                    stack.push("문제");


                } else
                    stack.pop();
            }
        }
        if (stack.isEmpty()){
            System.out.println("고무오리야 사랑해");
        }else
            System.out.println("힝구");
    }
}
