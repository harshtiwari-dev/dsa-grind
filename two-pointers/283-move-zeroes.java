// Problem: Move all 0s to the end of the array in-place while keeping the relative order of non-zero elements.
// Approach: Two pointers - i scans the array, k marks the next slot for a non-zero element; swap nums[i] with nums[k] whenever nums[i] != 0, then k++.
// Time: O(n)
// Space: O(1)
// Mistakes made while solving:
//   - [LOGIC]: Swap condition was first thought as nums[i] == 0, but k marks the slot for non-zero elements so it must be != 0.
//   - [LOGIC]: Forgot k++ after the swap in the first code, so k stayed stuck at 0 and the order broke.

class Solution {
    public void moveZeroes(int[] nums) {
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] =temp;
                k++;
            }
        }
    }
}