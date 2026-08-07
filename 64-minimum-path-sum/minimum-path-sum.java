import java.util.Arrays;
class Solution {
    int[][] dp = new int[201][201];
    public int minPathSum(int[][] grid) {
        for(int i=0;i<dp.length;i++){ 
        Arrays.fill(dp[i],-1);
    }
    int n = grid.length;
    int m = grid[0].length;
    return helper(grid,0,0,n,m);
    }
    public int helper(int[][] grid,int row,int col,int n,int m){
        if(row==n-1 && col==m-1) return grid[row][col];
        if(row>=n || col>=m) return Integer.MAX_VALUE;
        if(dp[row][col]!=-1) return dp[row][col];
        return dp[row][col] = grid[row][col] + Math.min(helper(grid,row+1,col,n,m),helper(grid,row,col+1,n,m));
    }
}