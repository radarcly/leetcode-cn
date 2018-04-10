class Solution {
    public boolean isPalindrome(int x) {
       if(x<0){
           return false;
       }else{
           int div = 1;           
           while(x/div>=10){
              div *= 10;
           }         
           while(x!=0){               
               int high = x/div;
               int low = x%10;
               if(high!=low){
                   return false;
               }else{                   
                   x = (x % div)/10;                  
                   div = div/100;
               }              
           }
           return true;
       }
    }
}