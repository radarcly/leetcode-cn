class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(list,"",0,0,2*n);
        return list;
    }

    public void generate(List<String> list,String str,int left,int right, int all){
        if(left + right == all){
            list.add(str);
            return;
        }
        //①
        if(left < all/2){
            generate(list,str+"(",left+1,right,all);
        }
        //②
        if(right < left){
            generate(list,str+")",left,right+1,all);
        }
    }
    //注意点
    //1. ①和②的位置不可交换，否则会陷入死循环，一直生成()()()这种类型的括号
    //2. ①中不能直接更改str和left 再递归调用，不然回溯过程中会影响②中的str和left值，从而使得结果不正确。
}