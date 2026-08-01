class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int rowstart=0;
        int rowend=r-1;
        int colstart=0;
        int colend = c-1;
        while(rowstart<=rowend && colstart <= colend){
            int i=colstart;
            while(i<=colend){
                ans.add(matrix[rowstart][i]);
                i++;
            }
            rowstart++;
            int j = rowstart;
            while(j<=rowend){
                ans.add(matrix[j][colend]);
                j++;
            }
            colend--;
            int k = colend;
            if(rowstart<=rowend){
            while(k>=colstart){
                ans.add(matrix[rowend][k]);
               k--;
            }
            }
            rowend--;
            int p=rowend;
            if(colstart<=colend){ 
            while(p>=rowstart){
                ans.add(matrix[p][colstart]);
                p--;
            }
            }
            colstart++;
        }
        return ans;
    }
}