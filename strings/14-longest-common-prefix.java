// Problem statement:
// Find the longest common prefix string amongst an array of strings.

// Approach / Pattern:
// Shortest String + Character-by-Character Comparison

// Thinking:
// 1. Pehle socha ki har character position ko sabhi strings mein compare karunga.
// 2. i = character position aur j = string number rakha.
// 3. Initial mistake: outer loop mein strs.length use kiya,
//    jiski wajah se ["flower","flower","flower","flower"] ka answer "flow" aa raha tha.
// 4. Empty string case bhi handle karna pada.
// 5. Optimized thinking: shortest string maximum possible common prefix ho sakti hai.
// 6. Isliye pehle shortest string find ki aur uske characters ko sabhi strings
//    ke same index par compare kiya.

// Pattern Recognition Tip:
// "Longest Common Prefix" → shortest string is the maximum possible answer.
// Prefix comparison → same index ke characters compare karo.

// Time: O(n * m)
// Space: O(1)

// Mistakes made while solving:
// - [LOGIC]: Outer loop mein strs.length use kiya tha, jabki i character position
//   represent kar raha tha. Correct boundary shortest.length() honi chahiye.
// - [LOGIC]: i aur j ke roles initially mix ho gaye the.
//   i = character position, j = string number.
// - [LOGIC]: answer ko inner loop ke andar add kar raha tha,
//   jiski wajah se same character multiple times add ho sakta tha.
// - [EDGE CASE]: Empty string [""] ko handle nahi kiya tha, jiski wajah se
//   StringIndexOutOfBoundsException aaya.

// Final Code:

class Solution {
    public String longestCommonPrefix(String[] strs) {

        String shortest = strs[0];

        for (String str : strs) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }

        for (int i = 0; i < shortest.length(); i++) {

            char ch = shortest.charAt(i);

            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return shortest.substring(0, i);
                }
            }
        }

        return shortest;
    }
}