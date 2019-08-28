//双指针
public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int newLen = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[newLen-1]) {
                nums[newLen] = nums[i];
                newLen++;
            }
        }
        return newLen;
}

