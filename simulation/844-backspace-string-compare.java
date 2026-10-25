// Problem: Given two strings s and t where '#' means backspace, return true if both become equal after typing them into empty text editors.
// Approach: Simulate the editor - helper builds the final string with a StringBuilder (append letters, deleteCharAt last on '#' only if non-empty), then compare both results with equals().
// Time: O(n + m)
// Space: O(n + m)
// Mistakes made while solving:
//   - [LOGIC]: Appended the loop index instead of the character, and the '#' (backspace) case was missing at first.
//   - [SYNTAX]: Helper nested inside the other method, ':' instead of ';', 'appends' instead of 'append', char as loop index, sb.length(>0), and type written in a method call (helper(String s)).

class Solution {
    public boolean backspaceCompare(String s, String t) {

        String as = helper(s);
        String ts = helper(t);

        return as.equals(ts);

        
    }

    public String helper(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                sb.append(s.charAt(i));
            }
            else{
                if(sb.length()>0){

                sb.deleteCharAt(sb.length()-1);

                }
            }
        }

        return sb.toString();
    
    }
}