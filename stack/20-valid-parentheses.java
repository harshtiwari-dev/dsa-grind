// Problem: Determine whether brackets in a string are valid and correctly ordered
// Approach: Stack (LIFO) + Matching Brackets
// Time: O(n)
// Space: O(n)
// Mistakes made while solving:
//   - [SYNTAX]: Incorrect char comparisons and missing parentheses
//   - [LOGIC]: Compared opening brackets directly with closing brackets
//   - [SCOPE]: Incorrect placement of matching conditions and pop()

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                if ((ch == ')' && stack.peek() != '(') ||
                    (ch == ']' && stack.peek() != '[') ||
                    (ch == '}' && stack.peek() != '{')) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}