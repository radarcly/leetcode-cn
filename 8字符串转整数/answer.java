class Solution {
    public int myAtoi(String str) {       
        str = str.trim();                                     //去掉字符串前后的空白
        if(str.equals("")||str.equals("+")||str.equals("-")){ //对于三种类空白字符串直接返回0
            return 0;
        }
        if(str.substring(0,1).equals("-")){                   //在第一个字符为负号的情况下，特殊处理
            str = str.substring(1);                           
            if(!Character.isDigit(str.charAt(0))){
                return 0;
            }else {
                int length = str.length();
                int i = 0;                                   //i表示数字的位数
                while(i<length&&Character.isDigit(str.charAt(i))){
                    i++;
                }
                if(i>10){                                    //位数多于十过int表示范围
                    return -2147483648;
                }else{                                       //位数小于十位则可直接转换成long然后和最小值比大小
                    Long num = Long.valueOf(str.substring(0,i));
                    if(num>2147483648l){                
                        return -2147483648;     
                    }else{
                        return Integer.valueOf("-"+str.substring(0,i));
                    }
                }
            }
        }else if(str.substring(0,1).equals("+")){            //在第一个字符为正号的情况下，去掉正号，和没有符号的情况一起处理
            str = str.substring(1);
        }
        if(!Character.isDigit(str.charAt(0))){
            return 0;
        }else {
            int i = 0;
            int length = str.length();
            while(i<length&&Character.isDigit(str.charAt(i))){
                i++;
            }
            if(i>10){                                        
                return 2147483647;
            }else{
                Long num = Long.valueOf(str.substring(0,i));
                if(num>2147483647){
                    return 2147483647;
                }else{
                    return Integer.valueOf(str.substring(0,i));
                }
            }
        }
    }
}