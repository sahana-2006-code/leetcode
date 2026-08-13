class Solution {
    public int lastStoneWeightII(int[] stones) {
        int s=0;
        for(int i=0;i<stones.length;i++){
            s+= stones[i];
        }
        boolean[][] dp = new boolean[stones.length+1][(s/2)+1];
        dp[0][0] =true;
        for(int i=1;i<=stones.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(stones[i-1]<=j){
                    boolean in = dp[i-1][j-stones[i-1]];
                    boolean ex = dp[i-1][j];
                    dp[i][j] = in || ex;
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int wantedsum=0;
        for(int j=(s/2);j>=0;j--){
            if(dp[stones.length][j]){
                wantedsum = j;
                break;
            }
        }
        return s-(2*wantedsum);
    }
}