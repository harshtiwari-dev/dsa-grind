// Problem statement: Return the running sum of a 1D array.
// Approach/pattern: Prefix Sum (In-place Running Sum)
// Time: O(n)
// Space: O(1)

class Solution {
    public int[] runningSum(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}