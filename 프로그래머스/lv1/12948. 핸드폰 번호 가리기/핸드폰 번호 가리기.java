import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String first = phone_number.substring(0,phone_number.length()-4);
        String end = phone_number.substring(phone_number.length()-4,phone_number.length());
        first = first.replaceAll(".","*");
        System.out.print(first);
        return first+end;
    }
}