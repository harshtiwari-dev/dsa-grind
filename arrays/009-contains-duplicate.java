// Problem statement: Check if any value appears at least twice in the array.
// Approach/pattern: Use a HashSet to track previously seen elements.
// Time: O(n) average
// Space: O(n)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            
        }
        return false;
    }
}

