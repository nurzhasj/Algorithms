class Solution {
    public int longestConsecutive(int[] nums) {
        //Approach: Using HashSet, T.C:O(n), S.C: O(n)

        //initialize a set
        HashSet<Integer> s = new HashSet<>();
        //add elements to the set
        for(int num:nums){
            s.add(num);
        }
        //initialize the longest
        int longest = 0;

        //traverse
        for(int n:nums){
            /*if the index value-1 is not present in our set, that means
            that is may be the starting index of the sequence
            */ 
            if(!s.contains(n-1)){
                //initialize the length of the sequence
                int length = 0;
                //traverse and count how many values are consequtive
                while(s.contains(n+length)){
                    length+=1;
                }
                //find the max
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
