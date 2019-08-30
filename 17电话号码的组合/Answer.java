class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        combine(result,digits);
        return result;
    }
    public void combine(List<String> list,String digits) {
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
            return;
        }else{
            String str = arr[Integer.valueOf(digits.substring(0,1))];
            if(list.size() == 0){
                for(int i=0;i<str.length();i++){
                    list.add(str.substring(i,i+1));
                }
            }else{
                List<String> newList = new ArrayList<String>();
                for(int i=0;i<list.size();i++){
                    for(int j=0;j<str.length();j++){
                        newList.add(list.get(i)+str.substring(j,j+1));
                    }
                }
                list.clear();
                //注意这里不能直接将newList赋给list 这样只会使得list在方法内指向newList，跳出方法后重新指向原来的list。
                list.addAll(newList);
            }
            digits = digits.substring(1);
            combine(list,digits);
            return;
        }
    }
}