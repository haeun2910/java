package d10.Q1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
Q1
사용자에게 반복적으로 음악 정보를 입력받자. 입력받는 정보는 다음과 같다.

제목
앨범
가수
공개일

아래는 입력하는 과정의 예시이다.

title: Maybe Man
album: The Maybe Man
artist: AJR
release: 2023-11-10
Saved!!!
Add more? [y/N]: y


이때 마지막에 y가 입력되면 다시 정보를 입력하고, N이 입력되면 입력이 종료된다.

이후 입력된 정보들을 파일로 저장한 다음, 저장된 파일의 내용을 읽어 다시 확인할 수 있도록 하는 코드를 작성하시오.

Music 1
title: Maybe Man
album: The Maybe Man
artist: AJR
release: 2023-11-10

Music 2
...
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Music> song = bufferedReader();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        for( Music music : music1){
//            System.out.println(music);
//        }
//        List<Music> song;
        while (true) {
            System.out.println("title: ");
            String title = reader.readLine();
            System.out.println("album: ");
            String album = reader.readLine();
            System.out.println("artist: ");
            String artist = reader.readLine();
            System.out.println("release: ");
            String release = reader.readLine();
            Music music = new Music(title, album, artist, release);
            song.add(music);
            System.out.println("saved!!!");
            System.out.println("add more? [y/n]: ");
            String hasNext = reader.readLine();
            // 없다면
            if (hasNext.equals("n")) {
                // 종료
                break;
            }
        }
        bufferedWriter(song);
//        bufferedReader(song);
    }
    private static void bufferedWriter(List<Music> song) {
        try(FileWriter fileWriter = new FileWriter("music.csv");
            BufferedWriter writer = new BufferedWriter(fileWriter)){
            for( Music music : song){
                StringBuilder lineBuilder = new StringBuilder();
                lineBuilder.append(music.getTitle()).append("\n");
                lineBuilder.append(music.getAlbum()).append("\n");
                lineBuilder.append(music.getArtist()).append("\n");
                lineBuilder.append(music.getRelease());
                String line = lineBuilder.toString();
                writer.write(line);
                writer.newLine();
            }

        }catch (IOException e){
            System.out.println(" 데이터 작성을 위한 파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
    }
    public static List<Music> bufferedReader() {
        List<Music> song = new ArrayList<>();
        try (FileReader fileReader = new FileReader("music.csv");
            BufferedReader reader = new BufferedReader(fileReader)){
            String line;
        }catch (IOException e){
            System.out.println("파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
        return song;
    }
}
