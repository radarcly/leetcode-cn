class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int lenA = a.length();
        int lenB = b.length();
        int lenMin = lenA<lenB?lenA:lenB;
        int add = 0;
        for(int i=0;i<lenMin;i++){
            int temp = Integer.valueOf(a.substring(lenA-i-1,lenA-i)) + Integer.valueOf(b.substring(lenB-i-1,lenB-i)) + add;
            add = temp/2;
            temp = temp%2;
            result = String.valueOf(temp) + result;
        }
        if(lenA>lenMin){
            for(int i=0;i<lenA-lenMin;i++){
                int temp = Integer.valueOf(a.substring(lenA-lenMin-i-1,lenA-lenMin-i)) + add;
                add = temp/2;
                temp = temp%2;
                result = String.valueOf(temp) + result;                       }
        }else if(lenB>lenMin){
            for(int i=0;i<lenB-lenMin;i++){
                int temp = Integer.valueOf(b.substring(lenB-lenMin-i-1,lenB-lenMin-i)) + add;
                add = temp/2;
                temp = temp%2;
                result = String.valueOf(temp) + result;                       }
        }
        if(add!=0){
            result = "1" + result;
        }
        return result;

    }
}