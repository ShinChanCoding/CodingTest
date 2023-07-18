// import java.util.*;
// class Solution {
//     public String[] solution(String[] strings, int n) {
//         Map<Character, String> secondWord = new TreeMap<>();
//         for(int i = 0; i < strings.length; i++){
//             secondWord.put(strings[i].charAt(n),strings[i]);
//             System.out.println(secondWord);
//         }
//         String[] answer = new String[strings.length];
//         int num = 0;
//         for(Character a : secondWord.keySet()){
//             answer[num] = secondWord.get(a);
//             num++;
//         }
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(list);
        
        answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }             
        return answer;
    }
}