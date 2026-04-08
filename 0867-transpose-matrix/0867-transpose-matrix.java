class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] newm = new int[m][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                newm[j][i] = matrix[i][j];  // ✅ correct
            }
        }
        return newm;
    }
}