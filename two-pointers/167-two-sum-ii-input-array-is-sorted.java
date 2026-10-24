
// Problem statement: Sorted array (1-indexed) mein do numbers dhundo jinka sum target ho, aur unke indices (1-indexed) return karo. Extra space allowed nahi.
// Approach/pattern: Two Pointers - left (smallest) aur right (largest) se start, sum ke hisaab se pointer move karo
// Time: O(n)  [brute force: O(n^2)]
// Space: O(1)

// Thinking:
// 1. Array sorted hai, to left pe sabse chhota aur right pe sabse bada element hota hai.
// 2. i = 0, j = n-1 se start. Har step pe sum = numbers[i] + numbers[j] check karo.
//    - sum == target -> answer mil gaya, (i+1, j+1) return (1-indexed).
//    - sum > target  -> sum chhota karna hai, j-- (right pe bada value hai, peeche ka chhota hoga).
//    - sum < target  -> sum bada karna hai, i++ (left pe chhota value hai, aage ka bada hoga).
// 3. while (i < j): i aur j cross ho jayein to ruk jao, same element do baar use nahi hona chahiye.
// 4. Pointers INDEX hote hain, value nahi. Value tab milti hai jab numbers[i] likhte hain.
// 5. Brute force (O(n^2)) har pair check karta hai, n = 30000 pe TLE deta hai.
//    Sorted hone ki property ka fayda uthake har step pe ek option eliminate ho jaata hai, isliye O(n).

// Dry run: numbers = [2,7,11,15], target = 9
// i=0, j=3: 2+15=17 > 9  -> j=2
// i=0, j=2: 2+11=13 > 9  -> j=1
// i=0, j=1: 2+7 =9  == 9 -> return [1,2]

// Mistakes made while solving:
//   - [APPROACH]: Pehle brute force (nested loops) se kiya, sorted array ka fayda nahi uthaya. Result: Time Limit Exceeded.
//   - [LOGIC]: Inner loop ka start j = 0 rakha, to same element do baar use ho gaya. Phir j = 1 rakha, wo bhi galat tha. Sahi: j = i + 1.
//   - [LOGIC]: int i = numbers[0] likha, yaani pointer mein value store kar di. Pointer hamesha index hota hai (i = 0, j = n - 1).
//   - [LOGIC]: sum == target wala case comment out kar diya, to loop kabhi rukta hi nahi tha (infinite loop, TLE).

// Key learnings (revision ke liye):
//   - Sorted array + pair/target sum = Two Pointers (left, right) ka signal.
//   - Two-pointer loop likhne se pehle teen cheezein check karo: pointers kya hain (index), start kahan se hai, loop kab rukega.
//   - Pair wale nested loops mein hamesha j = i + 1 se start karo.
//   - Return mein 1-indexed ke liye +1 mat bhulna.
//   - Is question mein bhi "pointer kya hai" wala confusion tha, jaise 26 (Remove Duplicates) mein tha.

class Solution {

    // Optimal: Two Pointers, O(n) time, O(1) space
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[] { i + 1, j + 1 };
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] { -1, -1 };
    }

    // Brute Force: Nested Loops, O(n^2) time, O(1) space (LeetCode pe TLE deta hai)
    public int[] twoSumBruteForce(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] { i + 1, j + 1 };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}