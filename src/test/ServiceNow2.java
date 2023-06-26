package test;

import java.util.HashMap;

public class ServiceNow2 {
    public static void main(String args[]) {
        System.out.println(firstDuplicateLetter("abccdaac"));

    }
    public static Character firstDuplicateLetter(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (seen.containsKey(letter)) {
                return letter;
            } else {
                seen.put(letter, 1);
            }
        }
        return null;
    }
}
