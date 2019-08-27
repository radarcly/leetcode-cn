/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 

class Solution {
	//非递归解法
    public ListNode swapPairs(ListNode head) {
        ListNode first = new ListNode(-1);
        first.next = head;
        ListNode prev = first;
        while(head != null && head.next!=null ){
            ListNode temp = head.next.next;//存3
            head.next.next = head; //2指向1
            prev.next = head.next; //-1指向2
            head.next = temp;     // 1指向3
            prev = head;          //前置节点指向1
            head = temp;          //head指向3
        }
        return first.next;
    }
	//递归解法
	public ListNode swapPairs1(ListNode head) {
		if(head == null || head.next == null){
			return head;
		}
		ListNode next = head.next;
		head.next = swapPairs1(next.next);
		next.next = head;
		
        return next;
    }
}