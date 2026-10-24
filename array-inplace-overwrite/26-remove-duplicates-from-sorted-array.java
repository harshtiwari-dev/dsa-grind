// Problem statement: Sorted array se duplicates in-place remove karo (har unique element sirf ek baar), aur unique elements ki count k return karo.
// Approach/pattern: Two Pointers (slow writer + fast reader) - In-place Overwrite
// Time: O(n)
// Space: O(1)

// Thinking:
// 1. Array sorted hai, to duplicates hamesha saath-saath (adjacent) hote hain.
// 2. i pointer array ko left se right scan karta hai (reader).
// 3. k pointer batata hai agla unique element kahan likhna hai (writer).
// 4. nums[0] hamesha unique hai, isliye k = 1 se start aur i = 1 se loop.
// 5. nums[i] ko nums[k-1] (last likhe hue unique element) se compare karo.
//    - Same hai -> duplicate hai, kuch nahi karna, i aage badh jayega.
//    - Alag hai -> naya unique hai, nums[k] = nums[i] aur k++.
// 6. k hamesha i se peeche ya barabar rehta hai, isliye koi unread value overwrite nahi hoti.
// 7. Array chhoti nahi hoti, k ke baad ka garbage checker ignore karta hai.

// Dry run: [0,0,1,1,1,2]
// i=1: 0 == nums[0] -> skip                  k=1
// i=2: 1 != nums[0] -> nums[1]=1             k=2  [0,1,1,1,1,2]
// i=3: 1 == nums[1] -> skip                  k=2
// i=4: 1 == nums[1] -> skip                  k=2
// i=5: 2 != nums[1] -> nums[2]=2             k=3  [0,1,2,1,1,2]
// Return 3 -> pehle 3 elements [0,1,2] sahi hain.

// Mistakes made while solving:
//   - [APPROACH]: Pehle swap karne ka socha (nums[i+1] ko nums[i+2] se swap). Yahan swap ki jagah overwrite wali two-pointer technique chahiye thi.
//   - [LOGIC]: nums[i] ko nums[i+1] se compare karne ka socha. Sahi tarika last likhe hue unique element nums[k-1] se compare karna hai.

// Key learnings (revision ke liye):
//   - In-place questions (27, 26) mein "swap/shift" ka instinct aaye to ruko, "overwrite karo" socho.
//   - Reader pointer (i) aur writer pointer (k) alag rakho, writer sirf tab badhta hai jab valid element mile.
//   - if (nums.length == 1) wala check zaroori nahi tha, loop length 1 pe khud nahi chalta aur k = 1 sahi return hota hai.
//   - Ye "base case" nahi, edge case check hota hai. Base case recursion ka term hai.

class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}