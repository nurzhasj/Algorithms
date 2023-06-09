class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;     
        Set<Character> set = new HashSet<>();
        
        int l = 0;
        int r = 0;
        
        while (r < s.length()) {
            if (set.add(s.charAt(r))) {
                ans = Math.max(ans, set.size());
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        } 
        
        return ans;
    }
}
