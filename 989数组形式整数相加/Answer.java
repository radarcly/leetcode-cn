class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        int i = A.length - 1;
        while(i >= 0 || K > 0){
            if(i>=0)
                K += A[i];
            list.add( K % 10);
            K = K/10;
            i --;
        }
        Collections.reverse(list);
        return list;
    }
}