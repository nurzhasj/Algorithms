class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        
        int longest = 0;

        for (int num : set) {
            int length = 0;
            if (! set.contains(num + 1)) {
                length = 1;
            } else {
                while (set.contains(length + num)) {
                    length += 1;
                }
            }

            longest = Math.max(longest, length);
        }

        return longest;
    }
} // There is a time limit issue with this code on very long input data
