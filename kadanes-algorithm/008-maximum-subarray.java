// Problem statement: Find the contiguous subarray with the largest sum.
// Approach/pattern: Kadane's Algorithm - maintain a running sum and maximum sum.
// Time: O(n)
// Space: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max = Math.max(max ,sum);
            if(sum<0){
                sum =0;
            }
        }
        return max;

    }
}

