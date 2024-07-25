package prob;
// https://school.programmers.co.kr/learn/courses/30/lessons/181914
public class Q181914 {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        char[] arr = number.toCharArray();
//        for(char c : arr) {
//            int cong = Integer.parseInt(String.valueOf(c));
//            sum += cong;
//        }
//        answer = sum % 9;
//        return answer;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] - '0';
        }
        System.out.println('1' -'0');
        System.out.println('2' -'0');
        System.out.println('3' -'0');
        return sum % 9;
    }

    public static void main(String[] args) {
        System.out.println(new Q181914().solution("123"));
    }

}
