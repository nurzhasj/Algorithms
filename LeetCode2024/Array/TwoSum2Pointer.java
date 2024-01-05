class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (! map.containsKey(nums[i])) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            } else {
                List<Integer> list = map.get(nums[i]);
                list.add(i);
                map.put(nums[i], list);
            }
        }
        
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                int res1 = 0;
                int res2 = 0;

                List<Integer> iList = map.get(nums[i]);
                res1 = iList.get(0);
                iList.remove(0);
                List<Integer> jList = map.get(nums[j]);
                res2 = jList.get(0);
                jList.remove(0);
                
                return new int[]{res1, res2};
            }
        }

        return new int[]{};
    }
}
