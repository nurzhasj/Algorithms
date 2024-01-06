class Solution {
    public int lengthOfLastWord(String s) {
        String trimed = s.trim();
        int res = 0;    
    
        for (int i = trimed.length() - 1; i >= 0; i--) {
            if (trimed.charAt(i) != ' ') {
                res++;
            } else {
                return res;
            }
        }

        return res;
    }
}
