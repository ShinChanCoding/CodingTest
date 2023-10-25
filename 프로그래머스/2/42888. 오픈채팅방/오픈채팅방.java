import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> idMap = new HashMap<>();
        List<String> results = new ArrayList<>();

        for (String entry : record) {
            String[] info = entry.split(" ");
            String command = info[0];
            String userId = info[1];

            if (command.equals("Enter") || command.equals("Change")) {
                String nickname = info[2];
                idMap.put(userId, nickname);
            }
        }

        for (String entry : record) {
            String[] info = entry.split(" ");
            String command = info[0];
            String userId = info[1];

            if (command.equals("Enter")) {
                results.add(idMap.get(userId) + "님이 들어왔습니다.");
            } else if (command.equals("Leave")) {
                results.add(idMap.get(userId) + "님이 나갔습니다.");
            }
        }

        return results.toArray(new String[0]);
    }
}