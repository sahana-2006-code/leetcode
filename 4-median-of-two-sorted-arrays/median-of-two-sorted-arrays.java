class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] n = new int[nums1.length+nums2.length];
       int k=0;
       int i=0,j=0;
       while(i<nums1.length && j<nums2.length){
        if(nums1[i] < nums2[j]){
            n[k++] = nums1[i];
            i++;
        }else {
            n[k++] = nums2[j];
            j++;
        }
       }
       while(i<nums1.length){
        n[k++] = nums1[i++];
       }
       while(j<nums2.length){
        n[k++] = nums2[j++];
       }
       if(n.length%2!=0){
            return (double)n[n.length/2];
       }
        int a = n[n.length/2] + n[(n.length/2)-1];
        return (double)a/2.0;
    }
}