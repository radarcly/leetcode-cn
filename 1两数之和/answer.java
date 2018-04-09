class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){//外部循环：对数组中每个数字进行循环
            int middle = target - nums[i];//得到目标数与指定数组数字的差
            for(int j=i+1;j<nums.length;j++){//遍历数组剩余元素，看看有无相等元素出现
                if(middle==nums[j]){
                    int[] array = {i,j};
                    return array;//如果有，则构造相应数组返回。没有则进入下一次循环。               
                }
            }
        }
        return null;
    }
}