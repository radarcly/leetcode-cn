class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int temp = target - nums[i];
            if(hashmap.containsKey(temp)){
                return new int[]{i,hashmap.get(temp)};
            }
            hashmap.put(nums[i],i);
        }
        return null;
    }
}