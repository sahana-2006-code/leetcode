class Solution {
    int[] dp = new int[45+1];
    public int climbStairs(int n) {
        Arrays.fill(dp,-1);
        dp[0] =1;
        return helper(n);
    }
    public int helper(int n){
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = helper(n-1)+helper(n-2);
    }
}