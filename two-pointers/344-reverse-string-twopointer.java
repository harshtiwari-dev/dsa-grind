// Problem statement: Reverse the given character array in-place.
// Approach/pattern: Two Pointers — swap characters from both ends while moving inward.
// Time: O(n)
// Space: O(1)

class Solution {
    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}