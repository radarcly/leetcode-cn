class Solution {
    public boolean isValid(String s) {
        s = s.trim();
        if(s.length()==0){
            return true;
        }
        String left = "";
        for(int i=0;i<s.length();i++){
            String right = s.substring(i,i+1);
            if(right.equals("{") || right.equals("[") || right.equals("(")  ){
                left += right;
            }else{
                if(left.length() == 0){
                    return false;
                }else if(judgeMatch(left.substring(left.length()-1),right)){
                    left = left.substring(0,left.length()-1);
                }else{
                    return false;
                }
            }
        }
        if(left.length()==0){
            return true;
        }else{
            return false;
        }
    }
    public Boolean judgeMatch(String s1,String s2){
        if(s1.equals("{") && s2.equals("}") || s1.equals("[") && s2.equals("]") || s1.equals("(") && s2.equals(")")){
            return true;
        }else{
            return false;
        }
    }
}
