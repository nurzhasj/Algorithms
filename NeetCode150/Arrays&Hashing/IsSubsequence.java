class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        int ind = 0;

        for (int i = 0; i < t.length(); i++) {
            if (ind == s.length()) {
                break;
            }
            
            if (s.charAt(ind) == t.charAt(i)) {
                ind++;
            }
        }

        return ind == s.length();
    }
}
