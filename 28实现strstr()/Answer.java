//两层循环，但效率太低 不及KMP算法
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }else{
            for(int i=0 ;i<haystack.length()-needle.length()+1;i++){
                if(haystack.charAt(i)==(needle.charAt(0))){
                    int j = 1;
                    for(;j<needle.length();j++){
                        if(haystack.charAt(i+j)!= needle.charAt(j)){
                            break;
                        }
                    }
                    if(j==needle.length()){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}