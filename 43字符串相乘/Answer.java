class Solution {
    public String multiply(String num1, String num2) {
        int[] arr = new int[num1.length() + num2.length()];
        for(int i = num1.length()-1 ; i>=0 ; i--){
            for(int j = num2.length()-1 ; j>=0 ; j--){
                int carry = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                carry += arr[i+j+1];//加上之前的结果
                arr[i+j] += carry/10; //进位 注意这里也是＋
                arr[i+j+1] = carry % 10;
            }
        }
        StringBuilder sb = new StringBuilder("");
        int i=0;
        while(i<arr.length-1 && arr[i] == 0)
            i++;
        for(;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}