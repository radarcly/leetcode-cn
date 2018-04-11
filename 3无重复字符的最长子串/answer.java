class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<String> list = new ArrayList<String>();               //保存未出现重复的字符
        int maxLength = 0;                                              //存最大长度
        for(int i=0;i<s.length();i++){
            String nextStr = s.substring(i,i+1);
            int index = judge(nextStr,list);
            if(index!=-1){                                              //在出现重复字符的时候
                maxLength = maxLength>list.size()?maxLength:list.size();//最大长度取list.size和之前maxLength中较大值                   
                for(int j=0;j<=index;j++){                              //删除list中重复元素及其之前的元素
                    list.remove(0);
                }
            }        
            list.add(nextStr);
        }
        return maxLength>list.size()?maxLength:list.size();             //返回值取maxLength和当前list.size中的较大值
    }
    public int judge(String s,ArrayList<String> list){           //判断新添加的字符是否与list中字符重复，如果重复，则返回重复下标，不重复则返回 -1
        for(int i=0;i<list.size();i++){
            if(s.equals(list.get(i))){
                return i;
            }
        }
        return -1;
    }
}