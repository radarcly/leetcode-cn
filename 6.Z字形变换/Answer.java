class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        StringBuilder sb = new StringBuilder("");
        ArrayList<Character> arr[] = new ArrayList[numRows];
        for(int i=0;i<numRows;i++){
            arr[i] = new ArrayList<Character>();
        }
        int row = 0;
        int next = 1;
        for(int i=0;i<s.length();i++){
            arr[row].add(s.charAt(i));
            row += next;
            if(row == 0 || row == (numRows-1))
                next = -next;
        }
        for(int i=0;i<numRows;i++){
            for(int j=0;j<arr[i].size();j++){
                sb.append(arr[i].get(j));
            }
        }
        return sb.toString();
    }
}