
// Problem: Check if any two equal elements have indices i and j such that |i - j| <= k
// Approach: Compare each element with every element after it
// Thinking:
//   - Outer loop selects the first element
//   - Inner loop checks every element after it
//   - If values match and index distance <= k, return true
//   - If no valid pair is found, return false
// Time: O(n^2)
// Space: O(1)

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}

// Optimized Approach

// Problem: Check if any two equal elements have indices i and j such that |i - j| <= k
// Approach: Store each number's latest index in a HashMap and check the distance
// Thinking:
//   - HashMap stores number as key and its latest index as value
//   - containsKey(nums[i]) checks whether the number appeared before
//   - get(nums[i]) retrieves its previously stored index
//   - If the index distance <= k, return true
//   - Otherwise, update the number's index to the current index
//   - Updating the latest index helps detect nearby duplicates efficiently
// Time: O(n) average
// Space: O(n)
// Mistakes made while solving:
//   - [SYNTAX]: Initially misspelled containsKey(); fixed it during debugging

import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) &&
                Math.abs(i - map.get(nums[i])) <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }
}

