// Problem: Check if ransomNote can be constructed using letters from magazine (each letter used once)
// Approach: Frequency count magazine letters in int[26] array, then decrement for ransomNote and check negative
// Thinking:
//   - Since only lowercase letters (a-z), used int[26] instead of HashMap — faster + O(1) space
//   - ASCII trick: c - 'a' maps any lowercase char to index 0-25
//   - First loop builds available letter supply from magazine
//   - Second loop consumes from that supply for ransomNote; if count goes negative,
//     it means that letter wasn't available enough -> return false immediately
//   - If loop completes without going negative, ransomNote is fully constructible -> return true
// Time: O(n + m)
// Space: O(1) — fixed size 26 array

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count[] = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            count[c-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            count[c-'a']--;
            if(count[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}