
/*
 * Problem: Find the missing number in an array containing distinct numbers
 *          from the range [0, n].
 * Approach: HashSet - Store elements and check which number is missing
 * Thinking:
 *   - Store all array elements in a HashSet
 *   - Iterate from 0 to n and check if each number exists
 *   - Return the first number that is absent
 * Time: O(n) average
 * Space: O(n)
 * Mistakes made while solving:
 *   - [LOGIC]: Initially checked nums[i] instead of i

 */

import java.util.HashSet;

class MissingNumberHashSet {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i < n + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}

// Optimized Approach

// Problem: Find the missing number in an array containing distinct numbers
//          from the range [0, n].
// Approach: Mathematical Sum - Expected Sum minus Actual Sum
// Thinking:
//   - The expected sum of numbers from 0 to n is n * (n + 1) / 2
//   - Calculate the actual sum of all elements in the array
//   - Subtract actual sum from expected sum to get the missing number
//   - Use long to prevent integer overflow in the sum calculation
// Time: O(n)
// Space: O(1)

class Solution {
    public int missingNumber(int[] nums) {
        long n = nums.length;
        long expectedSum = n * (n + 1) / 2;
        long actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return (int) (expectedSum - actualSum);
    }
}
