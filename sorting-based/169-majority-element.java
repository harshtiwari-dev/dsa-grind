// Problem statement: Find the element that appears more than n/2 times in an array.
// Approach/pattern: Sort the array, then return the middle element which is guaranteed to be the majority element.
// Time: O(n log n)
// Space: O(log n)

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}