class Solution {
    int[][] dp = new int[101][101];
    public int uniquePaths(int m, int n) {
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,0,m,n);
    }
    public int helper(int row,int col,int m,int n){
        if(row==m-1 && col==n-1) return 1;
        if(row>m-1 || col>n-1) return 0;
        if(dp[row][col]!=-1) return dp[row][col];
        int ways = 0;
        if(row+1<m) {
            ways += helper(row+1,col,m,n);
        }
        if(col+1<n){
            ways += helper(row,col+1,m,n);
        }
        return dp[row][col] = ways;
    }
}