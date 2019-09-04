class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res=0;
        int abs=9999;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                int temp = Math.abs(target - sum);
                if(temp<abs){
                    abs = temp;
                    res = sum;
                }
                if(target-sum>0){
                    j++;
                }else if(target-sum<0){
                    k--;
                }else{
                    return res;
                }
            }
        }
        return res;
    }
}