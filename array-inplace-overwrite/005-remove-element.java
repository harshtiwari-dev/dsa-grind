// Problem statement: Remove all occurrences of val from nums in-place and return the number of remaining elements.
// Approach/pattern: Traverse the array and overwrite nums[count] with every element that is not equal to val.
// Time: O(n)
// Space: O(1)

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

