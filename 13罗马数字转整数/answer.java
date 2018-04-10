class Solution {
    public int romanToInt(String s) {
        int[] val = new int[128];  
        val['I'] = 1;  
        val['V'] = 5;  
        val['X'] = 10;  
        val['C'] = 100;  
        val['M'] = 1000;  
        val['L'] = 50;  
        val['D'] = 500; 
        int number = 0;
        for(int i=0;i<s.length();i++){
            if(i+1 == s.length() || val[s.charAt(i+1)] <= val[s.charAt(i)]){
                number += val[s.charAt(i)];
            }else{
                number -= val[s.charAt(i)];
            }                
        }
        return number;
    }
}