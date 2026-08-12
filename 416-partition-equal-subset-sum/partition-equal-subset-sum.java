class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum%2!=0) return false;
        int[][] dp = new int[nums.length+1][(sum/2)+1];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=0;
        }
        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }
        int tar = (sum)/2;
        for(int i=1;i<=nums.length;i++){
            for(int j=1;j<=tar;j++){
                if(nums[i-1]<=j){
                    int in = dp[i-1][j-nums[i-1]];
                      int ex = dp[i-1][j];
                    dp[i][j] = Math.max(in,ex);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[nums.length][tar]==1;
    }
}