class Solution {
    public int[] program1(int[] heights,int n){
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(nge,n);
        for(int i=0;i<n;i++){ 
        while(!st.isEmpty() && heights[st.peek()] > heights[i]){
             nge[st.pop()] = i;
        }
        st.push(i);
    } return nge;
    }
    public int[] program2(int[] heights,int n){
        int[] pge = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(pge,-1);
        for(int i=n-1;i>=0;i--){ 
        while(!st.isEmpty() && heights[st.peek()] > heights[i]){
             pge[st.pop()] = i;
        }
        st.push(i);
    } return pge;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
       int[] nge = program1(heights,n);
       int[] pge = program2(heights,n);
       int max=0;
     for(int i=0;i<n;i++){
        int h = heights[i];
        int w = nge[i]-pge[i]-1;
            int area = w*h;
            max = Math.max(area,max);
     }
   return max;
    }
}