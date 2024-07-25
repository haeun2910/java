package prob;

import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/178871
public class Q178871 {
    public static String[] solution(String[] players, String[] callings) {
        // 선수들의 현재 순위를 저장하는 맵
        Map<String, Integer> playerPositions = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerPositions.put(players[i], i);
        }

        // 추월할 때마다 순위 업데이트
        for (String calling : callings) {
            int currentPosition = playerPositions.get(calling);
            if (currentPosition > 0) {
                // 현재 위치의 앞 선수를 찾아서 교환
                String frontPlayer = players[currentPosition - 1];

                // 선수들의 위치 교환
                players[currentPosition - 1] = calling;
                players[currentPosition] = frontPlayer;

                // 맵에서 위치 업데이트
                playerPositions.put(calling, currentPosition - 1);
                playerPositions.put(frontPlayer, currentPosition);
            }
        }

        return players;
    }
}
