// Problem: Move all even integers before odd integers in-place.
// Approach: Two Pointers - Left/Right Partition + Swapping.
// Time: O(n)
// Space: O(1)
// Mistakes made while solving:
//   - [LOGIC]: Initially updated both pointers unconditionally,
//     which could skip elements that still needed checking.

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (nums[left] % 2 != 0 && nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            } else if (nums[left] % 2 == 0) {
                left++;
            } else {
                right--;
            }
        }

        return nums;
    }
}