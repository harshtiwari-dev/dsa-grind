// LeetCode 344: Reverse the given character array in-place using recursion.
// Two-pointer + recursion: swap i,j and move inward till i>=j
// Time: O(n)
// Space: O(n)
class Solution {
    public void reverseString(char[] s) {
        helper(s,0,s.length-1);
    }
    private void helper(char [] s ,int i, int j ){
        if(i>=j){
            return ;
        }
        char temp = s[j];
        s[j] = s[i];
        s[i] = temp;

        helper(s,i+1,j-1);
    }
}