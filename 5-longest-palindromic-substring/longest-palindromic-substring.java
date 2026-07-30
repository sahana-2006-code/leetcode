class Solution {
    String ans="";
    int maxlen=0;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            //odd
            expand(i,i,s);
            //even
            expand(i,i+1,s);
        }
        return ans;
    }
    public void expand(int left,int right,String s){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            int len = right-left+1;
            if(len>maxlen){ 
                maxlen = len;
            ans = s.substring(left,right+1);
            }
            left--;
            right++;
        }
    }
}