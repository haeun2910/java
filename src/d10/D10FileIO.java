package d10;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class D10FileIO {
    public static void main(String[] args) {
//        fileReader();
       List<Person> people = bufferedReader();
//        people = people.stream()
//                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
//                .toList();
        System.out.println("Current people");
        for(Person person : people) {
            System.out.println(person);
        }
        Scanner scanner = new Scanner(System.in);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            // 이름 입력하기
            System.out.print("name: ");
            String name = scanner.nextLine();
//            String name = reader.readLine();
            // 이메일 입력하기
            System.out.print("email: ");
            String email = scanner.nextLine();
            // 나이 입력하기
            System.out.print("age: ");
            int age = Integer.parseInt(scanner.nextLine());
            // 성별 입력하기
            System.out.print("gender: ");
            String gender = scanner.nextLine();

            // 사용자가 입력한 정보를 바탕으로 새로운 사람을 만들자
            Person person = new Person(name, email, age, gender);
            // 사람을 리스트에 추가해주자
            people.add(person);
            // 저장 메세지
            System.out.println("Saved!!!");
            // 사용자가 추가로 있는지 묻고,
            System.out.println("add more? [y/n]: ");
            String hasNext = scanner.nextLine();
            // 없다면
            if (hasNext.equals("n")) {
                // 종료
                break;
            }
        }
       bufferedWriter(people);

    }

    public static void bufferedWriter(List<Person> people) {
        try(FileWriter fileWriter = new FileWriter("output.csv"
//                ,true
        );
            BufferedWriter writer = new BufferedWriter(fileWriter)){
            for (Person person : people) {
//                writer.write(person.toString());
//                writer.newLine();
                StringBuilder lineBuilder = new StringBuilder();
                lineBuilder.append(person.getName()).append(',');
                lineBuilder.append(person.getEmail()).append(',');
                lineBuilder.append(person.getAge()).append(',');
                lineBuilder.append(person.getGender());
                String line = lineBuilder.toString();
                writer.write(line);
                writer.newLine();
            }
//            writer.write("Hello FileIO!!!!!!!");
//            writer.newLine();

        } catch(IOException e) {
            // 파일 열기 실패...
            System.out.println(" 데이터 작성을 위한 파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
    }

    public static List<Person> bufferedReader() {
        List<Person> people = new ArrayList<>();
        try (FileReader fileReader = new FileReader("people.csv");
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] elements = line.split(",");
                people.add(new Person(
                        elements[0],
                        elements[1],
                        Integer.parseInt(elements[2]),
                        elements[3]
                ));
            }
        } catch (IOException e) {
            // 파일 열기 실패...
            System.out.println("파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
//        System.out.println(people);
        return people;
    }


    public static void fileReader() {
        // Java 7 이후
        // try- with- resource
        List<Person> people = new ArrayList<>();
        try (FileReader reader = new FileReader("people.csv")) {
            // 읽어들인 문자를 저장하기 위한 변수
            int character;
            // 데이터를 모아서 문자열로 만들어줄 StringBuilder
            StringBuilder lineBuilder = new StringBuilder();
//            builder.append("alex");
//            builder.append(" ").append(25);
//            System.out.println(builder);
            // character에 읽은 결과를 넣어주고, 해당 값이 -1이 아닐 동안
            while ((character = reader.read()) != -1) {
                // 이번에 읽은 문자가 다음줄 ('\n', '\r')
                if (character == '\n' || character == '\r'){
                    // 한줄 끝, 문자열로 변환
                    String line = lineBuilder.toString();
                    if (line.isEmpty()) continue;
                    // 문자열을 ',' 단위로 나눈다.
                    String[] elements = line.split(",");
                    people.add(new Person(
                            elements[0],
                            elements[1],
                            Integer.parseInt(elements[2]),
                            elements[3]
                    ));
                    // lineBuilder 초기화
                    lineBuilder.setLength(0);
                }
                // 아니면 줄에 포함시킨다.
                else{
                    lineBuilder.append((char) character);
                }

            }

            // try- catch가 끝날때 reader.close()가 자동으로 동작한다.
        } catch (IOException e) {
            // 파일 열기 실패...
            System.out.println("파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
        System.out.println(people);
    }

    // FileReader를 사용하는 방식
    public static void fileReader7(){
        // Java 7 이전...
        FileReader reader = null;
        try{
        reader = new FileReader("people.csv");
        // reader를 이용해서 파일의 내용을 읽으면 되는데
    }catch (IOException e){
            // 파일 열기 실패...
            System.out.println("파일을 열지 못했습니다...");
            System.out.println(e.getMessage());

        }finally {
            if(reader != null){
                try{
                    reader.close();
                }catch (IOException e){
                    // ...여기까지 오면 개발자가 할 수 있는게 별로 없다.
                }
            }
        }
    }
}
