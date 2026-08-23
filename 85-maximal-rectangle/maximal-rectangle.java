class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] psum = new int[m][n];
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=0;j<m;j++){
                sum += matrix[j][i]-'0';
                   if(matrix[j][i]=='0') sum =0;
                   psum[j][i] = sum;
            }
        }
        int max = 0;
        for(int i=0;i<m;i++){
            int s = calculatelargestarea(psum,i);
            max = Math.max(s,max);
        }
        return max;
    }
    public int calculatelargestarea(int[][] arr,int index){
        int maxarea=0;
            int n = arr[index].length;
            int[] pse = new int[n];
            int[] nse = new int[n];
            Arrays.fill(nse,n);
            Arrays.fill(pse,-1);
            Stack<Integer> st = new Stack<>();
            for(int i=0;i<n;i++){
             while(!st.isEmpty() && arr[index][st.peek()]>arr[index][i]){
                nse[st.pop()] = i;
             }
             st.push(i);
            }
            st.clear();
            for(int i=n-1;i>=0;i--){
             while(!st.isEmpty() && arr[index][st.peek()]>=arr[index][i]){
                pse[st.pop()] = i;
             }
             st.push(i);
            }
            int area=0;
            for(int i=0;i<n;i++){
                int w = nse[i]-pse[i]-1;
                int h = arr[index][i];
                area = w*h;
                maxarea = Math.max(maxarea,area); 
            }
            return maxarea;
    }
}