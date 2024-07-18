package d9.prob;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
이 문제에서 사용하는 Person은 아래의 클래스이다.

Person으로 이뤄진 List, people이 있다고 가정하자.
이 List의 원소 중, 이름이 a 또는 A로 시작하는 사람들의 평균 나이를 구하는 메서드를, Stream API를 활용해 작성하시오.

 */
public class Q4 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alex", 25));
        people.add(new Person("Brad", 30));
        people.add(new Person("Chad", 27));
        people.add(new Person("Adam", 22));
        people.add(new Person("Dave", 35));
        System.out.println(aAvgAge(people));
    }
    public static double aAvgAge(List<Person> people){
        return people.stream()
                .filter(person -> {
                    String name = person.getName();
                    return name.startsWith("a") || name.startsWith("A");
                })
                .mapToInt(Person::getAge)
                .average().orElse(0.0);
//        Stream<Person> peopleStream = people.stream();
//        peopleStream = peopleStream
//                .filter(person ->{
//                    String name = person.getName();
//                    return name.startsWith("a") || name.startsWith("A");
////                    return name.charAt(0) == 'a' || name.charAt(0) == 'A';
//
//                } );
//        IntStream ageStream = peopleStream.mapToInt(person -> person.getAge());
//        return ageStream.average().orElse(0.0);
    }
}
