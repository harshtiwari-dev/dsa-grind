// Problem statement: Count how many words can be completely typed without using broken letters.
// Approach/pattern: Brute Force - Compare every character of each word with every broken letter.
// Time: O(n × m)
// Space: O(n) - words array created by split()

// Thinking:
// 1. Text ko individual words mein split kiya.
// 2. Har word ke har character ko brokenLetters ke har character se compare kiya.
// 3. Match milne par word ko invalid mark kiya.
// 4. Agar word mein koi broken letter nahi mila, count increase kiya.

// Approach:
// Har word ko traverse karo.
// Har character ko brokenLetters ke saath compare karo.
// Agar match mile -> word type nahi ho sakta.
// Agar poora word check ho jaye -> count++.


class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String words[] = text.split(" ");
        int count = 0;

        for (String word : words) {
            boolean canType = true;

            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < brokenLetters.length(); j++) {

                    if (word.charAt(i) == brokenLetters.charAt(j)) {
                        canType = false;
                        break;
                    }
                }

                if (!canType) {
                    break;
                }
            }

            if (canType) {
                count++;
            }
        }

        return count;
    }
}



