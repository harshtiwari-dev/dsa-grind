
// Problem: Find the duplicate number in an array of n + 1 integers,
//          where each integer is in the range [1, n]
// Approach: HashSet - Duplicate Detection
// Thinking:
//   - HashSet stores elements that have already been encountered
//   - set.add(nums[i]) returns false if the element already exists
//   - Return nums[i] when add() returns false
//   - Return -1 as a fallback
// Time: O(n) average
// Space: O(n)
// Mistakes made while solving:
//   - [LOGIC]: Initially called set.add(nums[i]) twice, causing incorrect duplicate detection
//   - Fixed it by checking the return value of a single add() call

import java.util.HashSet;

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }
}
