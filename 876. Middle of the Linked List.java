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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0,mid;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        mid=(count/2)+1;
        int c=1;
        ListNode temp1=head;
        while(c!=mid){
            temp1=temp1.next;
            c++;
        }
        return temp1;
    }
}