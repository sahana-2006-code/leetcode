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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
     //   ListNode temp = head;
        while(head!=null){
            pq.offer(head.val);
            head = head.next;
        }
        head = new ListNode(-1);
        ListNode ans = head;
        while(!pq.isEmpty()){
            int a = pq.poll();
            ans.next =  new ListNode(a);
            ans = ans.next;
        }
        return head.next;
    }
}