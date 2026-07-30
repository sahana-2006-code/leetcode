class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> m = new HashMap<>();
        int j=0;
        int l=0;
        int len=0;
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            while(m.get(s.charAt(i))>1){
                    m.put(s.charAt(j),m.get(s.charAt(j))-1);
                    j++;
            }
            l = i-j+1;
            len = Math.max(len,l);
        }
        return len;
    }
}