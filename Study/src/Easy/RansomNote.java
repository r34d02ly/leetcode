package Easy;

import java.util.HashMap;

public class RansomNote {

    String ransomNote = "baa", magazine = "aab";

    public boolean canConstruct01(String ransomNote, String magazine) {
        for(char c : ransomNote.toCharArray()){
            if(magazine.equals("")) return false;
            if(!magazine.contains(String.valueOf(c))) return false;

            magazine = magazine.replaceFirst(String.valueOf(c), "");
        }
        return true;

    }

    public boolean canConstruct02(String ransomNote, String magazine) {

        if(ransomNote.length() > magazine.length()) return false;

        // map에다가 magazine의 각 알바벳의 카운트를 세어서 저장함
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : magazine.toCharArray()) {
            if(map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for(char c : ransomNote.toCharArray()){
            if(map.get(c) == null) return false;

            if(map.get(c) == 0) return false;

            map.put(c, map.get(c) - 1);
        }

        return true;

    }

    public void methodTest() {
        System.out.println(canConstruct01(ransomNote, magazine));
    }
}
