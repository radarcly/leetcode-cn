class Solution {
    //两次扫描 + 哨兵节点 时间复杂度：O(L) 空间复杂度：O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        int len = 0;
        head = prehead;
        while(head.next!=null){
            head = head.next;
            len ++;
        }
        head = prehead;
        for(int i=0;i<len-n;i++){
            head = head.next;
        }
        head.next = head.next.next;
        return prehead.next;
    }

    //一次扫描方法  采用双指针使得只需要一次扫描 哨兵节点保证删除头部节点不会出错 时间空间复杂度同上
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        ListNode l1 = prehead;
        ListNode l2 = prehead;
        for(int i=0;i<n;i++){
            l1= l1.next;
        }
        while(l1.next!=null){
            l1=l1.next;
            l2=l2.next;
        }
        l2.next = l2.next.next;
        return prehead.next;
    }
}