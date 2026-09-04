// Problem statement: Check whether two strings are anagrams of each other.
// Approach/pattern: Frequency Array + Character Indexing using char - 'a'
// Time: O(n)
// Space: O(1)

class Solution {
    public boolean isAnagram(String s, String t) {
    //    if (s.length() != t.length()) {
    //     return false;
    //    }
    //     HashMap<Character, Integer> map = new HashMap<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         if(map.containsKey(s.charAt(i))){
    //             map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
    //         }else{
    //         map.put(s.charAt(i), 1);
    //         }

    //     }
    //     for (int i = 0; i < t.length(); i++){
    //         if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) > 0){
    //             map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
    //         }else{
    //             return false;
    //         }
    //     }
    //     return true;


            if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true; 
    }
}

