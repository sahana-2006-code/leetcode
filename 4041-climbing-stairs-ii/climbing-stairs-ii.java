class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n+1];
        dp[0] =0;
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third=Integer.MAX_VALUE;
        
        for(int j=1;j<=n;j++){
           if(j>=1){
            first = dp[j-1] + 1;
           }
           if(j>=2){
            second = dp[j-2] + 4;
           }
           if(j>=3){
           third = dp[j-3] + 9;
           }
            dp[j] = costs[j-1] + Math.min(first,Math.min(second,third));
        }
        return dp[n];
    }
}