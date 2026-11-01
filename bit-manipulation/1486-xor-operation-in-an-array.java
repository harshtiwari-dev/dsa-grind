
class Solution {
    // Problem: Return XOR of all elements in the generated array.
    // Approach: Array Construction + Running XOR
    // Time: O(n)
    // Space: O(n)

    public int xorOperation(int n, int start) {
        int nums[] = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
            ans = ans ^ nums[i];
        }

        return ans;
    }
}


// Learning Note: Unnecessary Array Creation

// In this problem, creating an additional `nums[]` array was not actually necessary.

// **Why?**
// - Each element can be calculated directly using `start + 2 * i`.
// - The calculated element is immediately used in the XOR operation.
// - We never need to access or reuse the stored array elements later.

// Therefore, we could directly write:

// `ans = ans ^ (start + 2 * i);`

// This would eliminate the extra array and reduce auxiliary space complexity from **O(n) to O(1)** while keeping time complexity O(n).

// **What I learned:** Before creating an additional array, check whether the elements actually need to be stored or can be processed immediately.