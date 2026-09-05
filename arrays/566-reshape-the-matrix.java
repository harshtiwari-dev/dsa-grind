// Problem statement: Reshape a matrix into r × c dimensions while preserving element order.
// Approach/pattern: Array Traversal + Index Mapping using k / c and k % c
// Time: O(m × n)
// Space: O(r × c)
// Thinking/Approach:
// - Pehle socha ki reshape tabhi possible hai jab original aur new matrix mein total elements same hon.
// - Original matrix ko ek continuous sequence ki tarah traverse kiya.
// - Ek k variable se current element ki flattened position track ki.
// - New matrix mein row ke liye k / c aur column ke liye k % c use kiya.

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];


        if (mat.length * mat[0].length != r * c) {
            return mat;
        }

        int k = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[k / c][k % c] = mat[i][j];
                k++;
            }
        }

        return result;
    }


}
