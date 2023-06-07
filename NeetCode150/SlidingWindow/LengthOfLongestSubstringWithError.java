class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        char[] ch = s.toCharArray();

        int start = 0;
        int end = 0;

        // to check uniqueness of elements
        Set<Character> set = new HashSet<>();

        // if end pointer reaches the end of array
        // it is guaranteed that we already have longest substring
        while (end < ch.length) { 
            if (set.contains(ch[end])) {
                ans = Math.max(ans, end - start); 
                start++;
            } else {
                set.add(ch[end]); // p
                end++;
            }
        }

        // pwwkew -> len 6
        
        return ans;
    }
}
