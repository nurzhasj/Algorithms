class Solution {
    public List<List<Integer>> threeSum(int[] nums) {     
        int n = nums.length - 1; // by index
        Arrays.sort(nums); // to perform Two Pointer Method
        List<List<Integer>> res = new ArrayList<>(); // the result list to return

        for (int f = 0; f <= n - 2; f++) {
            int i = f + 1;
            int j = n;

            while (i < j) {
                if (f > 0 && nums[f] == nums[f - 1]) break;
    
                if (nums[f] + nums[i] + nums[j] > 0) {
                    j--;
                } else if (nums[f] + nums[i] + nums[j] < 0) {
                    i++;
                } else {
                    res.add(new ArrayList<>(Arrays.asList(nums[f], nums[i], nums[j])));
                    while (i < j && nums[i] == nums[i + 1]) i++;
                    while (i < j && nums[j] == nums[j - 1]) j--;
                    i++;
                    j--;
                } 
            }
        } 

        return res;
    }   
}
