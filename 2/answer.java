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
        int flag = 0;//存储进位信息
        int result = l1.val + l2.val;//个位相加
        if(result>=10){
            flag=1;
            result-=10;
        }
        ListNode headNode = new ListNode(result);//存储头部节点用于返回
        ListNode tempNode = headNode;//存储中间节点        
        l1 = l1.next;
        l2 = l2.next;
        while(l1!=null||l2!=null||flag==1){ //如果l1链表 l2链表都循环结束 且此时没有进位信息，则跳出循环，否则执行循环
            if(l1!=null&&l2!=null){         //l1链表 l2链表都未循环结束
                result = l1.val + l2.val + flag; 
                l1 = l1.next;
                l2 = l2.next;
            }else if (l1!=null){           //l1链表还未循环结束
                result = l1.val + flag; 
                l1 = l1.next;
            }else if(l2!=null){            //l2链表还未循环结束
                result = l2.val + flag; 
                l2 = l2.next;
            }else{                         //还有进位符号
                result = 1;
            }
            if(result>=10){
                flag=1;
                result-=10;
            }else{
                flag=0;
            }
            tempNode.next = new ListNode(result);//创建新节点并赋给当前节点的next属性
            tempNode = tempNode.next;            //当前节点指向新节点   
        }
        return headNode;//返回头部节点 
    }
}