//package d10.Q2;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
///*
//사용자에게 반복적으로 식당 메뉴 정보를 입력받자. 입력받는 정보는 다음과 같다.
//
//메뉴 이름
//가격
//
//아래는 입력하는 과정의 예시이다.
//
//name: Noodles
//price: 5000
//Saved!!!
//Add more? [y/N]: y
//
//
//이 정보를 메뉴 이름 순으로 정렬한 다음, 정보를 파일로 저장한다.
//
//이후 파일로 저장된 정보를 읽어, 사용자에게 보여주고,
// 사용자는 주문하고 싶은 메뉴 번호와 갯수를 입력하면 총액을 출력하는 코드를 작성하시오. 아래는 예시이다.
//
//1. Noodles 5000
//2. Kastsu 6000
//Menu: 1
//Count: 2
//Total: 10000
// */
//public class Main {
//    public static void main(String[] args) {
//        List<Food> menu = bufferedReader();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        while (true) {
//            System.out.println("Menu: ");
//            String name = reader.readLine();
//            System.out.println("Price: ");
//            int price = Integer.parseInt(reader.readLine());
//            Food food = new Food(name, price);
//            menu.add(food);
//            System.out.println("Saved!!!");
//            System.out.print("add more? [y/n]: ");
//            String hasNext = reader.readLine();
//            if (hasNext.equals("n")) {
//                break;
//            }
//
//        }
//    }
//    public static void bufferedWriter(List<Food> menu){
//        try (FileWriter fileWriter = new FileWriter("menu.txt");
//        BufferedWriter writer = new BufferedWriter(fileWriter)) {
//            for (Food food : menu) {
//                StringBuilder lineBuilder = new StringBuilder();
//                lineBuilder.append(food.getName()).append(',');
//                lineBuilder.append(food.getPrice()).append("\n");
//                String line = lineBuilder.toString();
//                writer.write(line);
//                writer.newLine();
//
//            }
//        }catch (IOException e){
//            System.out.println("데이터 작성을 위한 파일을 열지 못했습니다...");
//            System.out.println(e.getMessage());
//        }
//    }
//    public static List<Food> bufferedReader() {
//        List<Food> menu = new ArrayList<>();
//        try (FileReader reader = new FileReader("foods.txt");
//        BufferedReader reader = new BufferedReader(FileReader)) {
//            String line;
//        }catch (IOException e) {
//            System.out.println("파일을 열지 못했습니다...");
//            System.out.println(e.getMessage());
//        }
//    }
//    return menu;
//}
