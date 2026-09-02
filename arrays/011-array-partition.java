// Problem statement: Given 2n integers, pair them to maximize the sum of the minimum value from each pair.
// Approach/pattern: Sort the array and add every alternate element starting from index 0.
// Time: O(n log n)
// Space: O(log n)

class Solution {
public int arrayPairSum(int[] nums) {
Arrays.sort(nums);


    int sum = 0;

    for (int i = 0; i < nums.length; i += 2) {
        sum += nums[i];
    }

    return sum;
}


}
