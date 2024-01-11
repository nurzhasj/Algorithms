class Solution {
    public int removeElement(int[] nums, int val) {    
        int l = -1;
        
        for(int r = 0; r < nums.length; r++)
        {
            if(nums[r] == val)
                continue;
            l++;
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        return l + 1;
    }
}
