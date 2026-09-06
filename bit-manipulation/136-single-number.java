// Problem statement: Find the element that appears only once when every other element appears twice.

// My initial thinking:
// Sorting karne par duplicate elements paas-paas aa jayenge,
// isliye pairs ko compare karke unique element find kar sakte hain.

// Initial approach:
// Array sort karo, phir elements ko pair-wise compare karo.
// Pair milne ke baad i += 2 kar sakte hain.

// Initial approach code:
// Arrays.sort(nums);
// for (int i = 0; i < nums.length - 1; i += 2) {
//     if (nums[i] != nums[i + 1]) {
//         return nums[i];
//     }
// }
// return nums[nums.length - 1];

// Mistakes made in initial approach:
//   - LOGIC/THINKING: Initially i++ ke saath adjacent elements compare kiye, jiski wajah se pair ka second element unique identify ho raha tha.
//   - LOGIC/THINKING: Pair-based approach mein i += 2 aur last element ko properly handle karna zaroori tha.

// Better thinking:
// Problem mein har element twice hai except one.
// Socha ki duplicates ko kisi operation se cancel kiya ja sakta hai.
// XOR mein a ^ a = 0 aur 0 ^ a = a, isliye duplicates cancel ho jaate hain.

// Approach/pattern:
// XOR — duplicate elements cancel each other because a ^ a = 0, while 0 ^ a = a.

// Pattern recognition tip:
// "Every element appears twice except one" → XOR immediately consider karo.
// General clue: Jab duplicates ko cancel karke unique element nikalna ho, XOR check karo.

// XOR mistake:
//   - LOGIC/THINKING: Initially XOR ko sirf "same = 0, different = 1" samjha; actually XOR bit-by-bit operate karta hai.

// Time: O(n)
// Space: O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        return result;
    }
}