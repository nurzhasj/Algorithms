class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        int endIdx = 1;
        int shortestWLen = 200;

        for (String s : strs) {
            shortestWLen = shortestWLen > s.length()
                ?  s.length() : shortestWLen;
        }
        
        for (int i = 0; i < shortestWLen; i++) {
            Set<String> set = new HashSet<>();

            for (String s : strs) {
                set.add(s.substring(0, endIdx));
            }

            if (set.size() > 1) return res;
            else res = set.stream().findFirst().get();

            endIdx += 1;
        }

        return res;
    }
}
