package d10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import d9.prob.Person;

public class Main {
    public static void main(String[] args) {
        // 사용자에게 이름과 아니를 입력받게 하자
        Scanner scanner = new Scanner(System.in);
        // 사람을 저장할 List
        List<Person> people = new ArrayList<>();
        while (true) {
            // 이름을 받자
            System.out.print("name: ");
            String name = scanner.nextLine();
            // 나이를 받자
            System.out.print("age: ");
            int age = Integer.parseInt(scanner.nextLine());
            // 사람을 만들고
            Person person = new Person(name, age);
            // 저장하자.
            people.add(person);
            System.out.print("Saved!!!");
            // 사용자가 추가로 있는지 묻고,
            System.out.println("add more? [y/n]: ");
            String hasNext = scanner.nextLine();
            // 없다면
            if (hasNext.equals("n")) {
                // 종료
                break;
            }
        }
        System.out.println(people);
    }
}
