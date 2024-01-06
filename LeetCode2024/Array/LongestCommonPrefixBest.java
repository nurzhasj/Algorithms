class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String shortest = strs[0];
        String longest = strs[strs.length - 1];

        int iter = 0;

        while (iter < shortest.length()) {
            if (shortest.charAt(iter) == longest.charAt(iter)) {
                iter += 1;
            } else {
                break;
            }
        }

        return shortest.substring(0, iter);
    }
}
