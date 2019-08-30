import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        combine(result,"",digits);
        return result;
    }

    public void combine(List<String> list,String str.String digits) {
        String[] arr = new String[10];
        arr[2] = "abc";
        arr[3] = "def";
        arr[4] = "ghi";
        arr[5] = "jkl";
        arr[6] = "mno";
        arr[7] = "pqrs";
        arr[8] = "tuv";
        arr[9] = "wxyz";
        if(digits.length() == 0){
            list.append(str);
            return;
        }else{
            String strs = arr[Integer.valueOf(digits.substring(0,1))];
            for(int i=0;i<strs.length();i++){
               combine(list,str + strs.substring(i,i+1),digits.substring(1));
            }
            return;
        }
    }
}