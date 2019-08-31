/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode headNode = new ListNode(-1);
        ListNode tempNode = headNode;

        while(l1!=null||l2!=null||flag>0){
            if (l1!=null){
                flag += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                flag += l2.val;
                l2 = l2.next;
            }
            tempNode.next = new ListNode(flag%10);
            flag /= 10;
            tempNode = tempNode.next;
        }
        return headNode.next;
    }
}