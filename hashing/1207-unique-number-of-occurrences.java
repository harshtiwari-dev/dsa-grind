
/*
 * Problem: Unique Number of Occurrences (LC 1207)
 *
 * Thinking:
 * First count the frequency of every distinct array element.
 * Then check whether any two elements have the same frequency.
 *
 * Approach / Pattern:
 * HashMap - Frequency Counting
 * HashSet - Duplicate Frequency Detection
 *
 * Time Complexity: O(n) average
 * Space Complexity: O(n)
 *
 * Mistakes made while solving:
 * - LOGIC: Used a global counter instead of existing element frequency.
 * - SYNTAX: Used contains() instead of containsKey().
 * - LOGIC: Used map.get(arr[i])++ for incrementing frequency.
 * - LOGIC: Initially confused HashMap keys with frequency values.
 * - LOGIC: Missed returning false when duplicate frequency was found.
 */

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        // Step 1: Count frequency of each element
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        // Step 2: Check whether frequencies are unique
        for (int f : map.values()) {
            if (!set.contains(f)) {
                set.add(f);
            } else {
                return false;
            }
        }

        return true;
    }
}
