// LeetCode 509: Return the nth Fibonacci number using recursion.
// F(n) = F(n-1) + F(n-2), base cases: F(0)=0, F(1)=1
// Time: O(2^n)
// Space: O(n)
class Solution {
    public int fib(int n) {
        if(n==0 || n ==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}