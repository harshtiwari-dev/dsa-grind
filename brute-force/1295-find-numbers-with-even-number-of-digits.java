
 // Problem: Count numbers containing an even number of digits
 // Approach: Integer Division - repeatedly divide each number by 10 and count digits
 // Time: O(n * d), where n = array length and d = maximum number of digits
 // Space: O(1)
//  LC 1295: Integer division by 10 removes the last digit, so repeated division can count digits without using modulo.

// Constraint handling: If nums[i] >= 0, handle nums[i] == 0 separately by setting the digit count to 1, because zero has one   digit. The current LC 1295 constraints require nums[i] >= 1, so this extra handling is unnecessary for the accepted solution.
//       Mistakes made while solving:
 //   - [LOGIC/THINKING]: Zero has 1 digit. If the constraint changes to nums[i] >= 0,
 //     handle temp == 0 by setting count = 1 before checking even digits.

class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            int temp = nums[i];
            while(temp>0){
                temp = temp/10;
                count++;
            }
            if(count%2==0){
                even++;
            }
        }
        return even;
    }
}
