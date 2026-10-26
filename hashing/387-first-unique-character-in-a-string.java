// Problem: Return the index of the first non-repeating character in a string, or -1 if none exists.
// Approach: Hashing with an int[26] frequency array: pass 1 counts every letter, pass 2 returns the first index whose letter has count 1.
// Time: O(n)
// Space: O(1)
// Mistakes made while solving:
//   - [APPROACH]: Started with a "unique string" and deleted chars on repeat, but a 3rd occurrence gets re-added (fails on "aaa"); switched to a counter array
//   - [LOGIC]: Forgot to actually increment the count (arr[idx]++)
//   - [LOGIC]: Used string index i to read arr instead of letter index idx (3 times); rule: arr gets idx, return gets i

class Solution {
    public int firstUniqChar(String s) {
        int arr[] =new int [26];
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            arr[idx]++;
        }
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            if(arr[idx]==1){
                return i;
            }
        }
        return -1;

    }
}