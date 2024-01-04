class Solution {
    public boolean isSubsequence(String s, String t) { 
        int lengthS = s.length();
        int lengthT = t.length();
        int count = 0;
        int pointerS = 0;
        int pointerT = 0;

        while (pointerS < lengthS && pointerT < lengthT) {
            if (s.charAt(pointerS) == t.charAt(pointerT)) {
                count += 1;
                pointerS += 1;
                pointerT += 1;
            } else {
                pointerT++;
            }
        }

        return count == lengthS;
    }
}
