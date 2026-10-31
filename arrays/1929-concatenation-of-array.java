
class Solution {
    // Problem: Create an array containing nums repeated twice.
    // Approach: Array Traversal - Copy elements into both halves.

    // Time: O(n)
    // Space: O(n)

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2 * n];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
