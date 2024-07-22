package prob;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/161990
public class Q61990 {
        public int[] solution(String[] wallpaperRaw) {
            int[] answer = new int[4];
            char[][] wallpaper = new char[wallpaperRaw.length][];
            // 1. wallpaper에 데이터를 장 넣어주자
            for (int i = 0; i < wallpaperRaw.length; i++) {
                // i번째 char[]에다가
                // i번째 wallpaperRaw의 char[] 버전을 넣어주겠다.
                wallpaper[i] = wallpaperRaw[i].toCharArray();
            }
            // 2. lux, luy를 wallpaper.length 만큼 설정을 해주자

            // 3. rdx, rdy를 0, 0으로 설정을 해주자
            int lux = wallpaper.length;
            int luy = wallpaper[0].length;
            int rdx = 0;
            int rdy = 0;

            // 4. 바탕화면을 한칸씩 살펴본다.
            for (int i = 0; i < wallpaper.length; i++) {
                // 한중 가져와서
                char[] row = wallpaper[i];
                // 각각 살펴보면서
                for (int j = 0; j < row.length; j++) {
                    // 해당 칸이 파일(#)이었다면?
                    if (row[j] == '#') {

                        // j가 luy보다 작으면 새로운 luy로
                        luy = Math.min(luy, j);
                        // j가 rdy보다 크면 새로운 rdy로
                        rdy = Math.max(rdy, j);
                        // i가 lux보다 작으면 새로운 lux로
                        lux = Math.min(lux, i);
                        // i가 rdx보다 크면 새로운 rdx로
                        rdx = Math.max(rdx, i);
                    }
                }
            }
            return new int[]{lux, luy, rdx + 1, rdy + 1};
        }
        public static void main(String[] args) {
            System.out.println(Arrays.toString(new Q61990()
                    .solution(new String[]{
                            ".#...",
                            "..#..",
                            "...#."
                    })));
        }
    }


