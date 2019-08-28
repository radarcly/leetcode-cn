class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int k = removeVacantList(lists);
        if(k==0){
            return null;
        }
        return mergeK(lists,k);  
                     
    }
    
    public static ListNode mergeK(ListNode[] lists,int k){
        ListNode node;
        if(k == 0){
            return null;
        }else{
            int index = getMinIndex(lists,k);
            node = lists[index];
            if(lists[index].next==null){
                k--;
                if(index<k){
                    lists[index] = lists[k];
                }
            }else{
                lists[index] = lists[index].next;
            }
            node.next = mergeK(lists,k);
            return node;
        }
    }
    
    public static int removeVacantList(ListNode[] lists){
        int k = lists.length;
        for(int i=0;i<k;){
            if(lists[i]==null){
                lists[i] = lists[k-1];
                k--;
            }else{
                i++;
            }
        }
        return k;
    }
    
    public static int getMinIndex(ListNode[] lists,int k){      
        int min = lists[0].val;
        int index = 0;
        for(int i=1;i<k;i++){
            if(lists[i].val < min){
                min = lists[i].val;
                index = i;
            }                
        }      
        return index;
    }
}