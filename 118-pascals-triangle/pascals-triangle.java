class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int n = numRows;
       int[][] arr = new int[n][n];
       for(int i=0;i<n;i++){
        arr[i][0] = 1;
        arr[i][i] = 1;
       }
       for(int i=2;i<n;i++){
        for(int j=0;j<=i;j++){ 
            if(arr[i][j]==0){ 
             arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
       }
        }
    }
    for(int i=0;i<n;i++){
        List<Integer> ll = new ArrayList<>();
        for(int j=0;j<=i;j++){
              ll.add(arr[i][j]);
        }
          list.add(ll);
    }
    return list;
}
}