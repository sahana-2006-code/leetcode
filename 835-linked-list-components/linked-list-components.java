/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
         
        ListNode temp = head;
        int c=0;
        if(head==null) return c;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        while(temp!=null){
            boolean flag=false;
              while(temp != null && set.contains(temp.val)){
                temp = temp.next;
                flag = true;
              }
              if(flag){
                c++;
              }else{
                temp = temp.next;
              }
        }
        return c;
    }
}