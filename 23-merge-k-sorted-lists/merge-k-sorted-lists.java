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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode l  = lists[i];
           while(l!=null){
            pq.offer(l.val);
            l = l.next;
           }
        }
        ListNode ans = new ListNode(-1);
        ListNode dummy = ans;
        while(!pq.isEmpty()){
            int a = pq.poll();
            ans.next = new ListNode(a);
            ans = ans.next;
        }
        return dummy.next;
    }
}