/*
 * ============================================================
 * LeetCode 258 - Add Digits
 * ============================================================
 *
 * Problem:
 * Repeatedly add all digits until only one digit remains.
 *
 * ============================================================
 * 🧠 INITIAL THINKING
 * ============================================================
 *
 * % 10 se last digit nikalunga.
 * / 10 se remaining number nikalunga.
 * Dono ko add karke result banaunga.
 *
 * Example:
 * 38
 * → 8 + 3 = 11
 *
 * ============================================================
 * ❌ MISTAKES MADE
 * ============================================================
 *
 * [LOGIC/THINKING]
 * int newNum = num / 10;
 *
 * Isse num update nahi hota.
 * Sirf newNum mein value store hoti hai.
 *
 * [LOGIC/THINKING]
 * Baad mein num /= 10 kiya.
 *
 * Isse:
 * 38 → 3
 *
 * ho raha tha.
 *
 * Lekin humein:
 * 38 → 11 → 2
 *
 * karna tha.
 *
 * Main realization:
 * "Jo result next iteration mein process hona hai,
 * wahi next iteration ka num banna chahiye."
 *
 * ============================================================
 * ✅ FINAL APPROACH
 * ============================================================
 *
 * 1. % 10 se last digit nikalo.
 * 2. / 10 se remaining number nikalo.
 * 3. Dono ko add karke result banao.
 * 4. Agar result single digit hai, return karo.
 * 5. Warna num = result karke next iteration mein process karo.
 *
 * ============================================================
 * 🎯 PATTERN RECOGNITION / REMEMBER
 * ============================================================
 *
 * Problem clue:
 * "Repeatedly perform the same operation"
 *
 * → Current result becomes next input.
 *
 * Digit manipulation:
 * → % 10 = last digit
 * → / 10 = remove last digit
 *
 * ============================================================
 * ⏱ COMPLEXITY
 * ============================================================
 *
 * Time: O(log n)
 * Space: O(1)
 *
 * ============================================================
 */

class Solution {
    public int addDigits(int num) {

        while(num>0){

            int lastDigit = num%10;

            int newNum = num/10;

            int result = lastDigit + newNum;

            if(result<10){
                return result;
            }

            num = result;
        }

        return 0;
    }
}