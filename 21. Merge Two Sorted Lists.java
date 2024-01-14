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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int count=0,tcount=0;
        ListNode temp1=list1,temp2=list2,curr=null,head=null,cnext=null;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                if(count==0){
                    head=temp1;
                    count=1;
                }
                if(tcount==0){
                    cnext=temp1;
                    tcount=1;
                }
                else{
                    cnext.next=temp1;
                    cnext=temp1;
                }
                curr=temp1;
                temp1=temp1.next;
            }else{
                if(count==0){
                    head=temp2;
                    count=1;
                }
                if(tcount==0){
                    cnext=temp2;
                    tcount=1;
                }
                else{
                    cnext.next=temp2;
                    cnext=temp2;
                }
                curr=temp2;
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
            if(count==0){
                head=temp1;
                count=1;
            }
             if(tcount==0){
                    cnext=temp1;
                    tcount=1;
                }
                else{
                    cnext.next=temp1;
                    cnext=temp1;
                }
            temp1=temp1.next;
        }
        while(temp2!=null){
            if(count==0){
                head=temp2;
                count=1;
            }
            if(tcount==0){
                    cnext=temp2;
                    tcount=1;
                }
                else{
                    cnext.next=temp2;
                    cnext=temp2;
                }
            temp2=temp2.next;
        }
        return head;
    }
}