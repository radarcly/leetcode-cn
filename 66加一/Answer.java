class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        for(;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;
    }
}