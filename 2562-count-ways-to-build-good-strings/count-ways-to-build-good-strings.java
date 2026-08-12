class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int mod = 1_000_000_007;
        int[] dp = new int[high+1];
        dp[0] =1;
        for(int i=1;i<dp.length;i++){
            if(i>=zero){ 
            dp[i] = (dp[i-zero])%mod;
        }
            if(i>=one){ 
            dp[i] = (dp[i] +  dp[i-one])%mod;
        }
    }
    int total=0;
    for(int i =low;i<=high;i++){
        total = (total +  dp[i])%mod;
    }
    return total;
}
}