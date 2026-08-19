class Solution {
    public int rob(int[] a) {
        int n = a.length;
        if(a.length==1){
            return a[0];
        }
        if(a.length==2){
            return Math.max(a[0],a[1]);
        }
        int[] dp = new int[n-1];
        dp[0] = a[0];
        dp[1] = Math.max(a[0],a[1]);
        
        for(int i=2;i<n-1;i++){
              int skip = dp[i-1];
              int notskip = dp[i-2]+a[i];
              dp[i] = Math.max(skip,notskip);
        }
        int ans1 = dp[dp.length-1];
        int[] dp1 = new int[n];
        dp1[0] = a[1];
        dp1[1] = Math.max(a[2],a[1]);
        
        for(int i=2;i<n-1;i++){
              int skip = dp1[i-1];
              int notskip = dp1[i-2]+a[i+1];
              dp1[i] = Math.max(skip,notskip);
        }
       int  ans2 = dp1[dp1.length-2];
        return Math.max(ans1,ans2);
    }
}