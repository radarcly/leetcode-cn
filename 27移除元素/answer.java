//双指针,不改变顺序
public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
}
//当删除元素很少时候双指针，会改变顺序
public int removeElement1(int[] nums, int val) {
    int i = 0;
    int n = nums.length;
    while (i < n) {
        if (nums[i] == val) {
            nums[i] = nums[n - 1];            
            n--;
        } else {
            i++;
        }
    }
    return n;
}
	//一个指针从前往后遍历不为val的，遇到等于val的从后往前找不为val的替换。
	public int removeElement2(int[] nums, int val) {
        int i = 0;
        int n = nums.length;	
        while (i < n) {
            if (nums[i] == val) {
                n--;
			    while(i<n){
				    if(nums[n]!=val){
					    nums[i] = nums[n];
					    i++;
					    break;
				    }else{
					    n--;
				    }
			    }       
            }else {
                i++;
            }
        }   

        return n;
    }
