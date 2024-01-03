class Solution {
    public boolean isSubsequence(String s, String t) { 
        int subSeqIdx = 0;
        int stopIdx = -1;
        for (int i = 0; i < s.length(); i++) {
            subSeqIdx = 0;
            for (int j = stopIdx + 1; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    stopIdx = j;
                    subSeqIdx = 1;
                    break;
                }    
            }

            if (subSeqIdx == 0) {
                return false;
            }
        }

        return true;
    }
}
// O(n^2)
