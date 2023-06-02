class Solution {
    public boolean isPalindrome(String s) {
        String alphaNums = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                alphaNums += c;
            }
        }

        return isValidPalindrome(alphaNums.toLowerCase());
    }

    private boolean isValidPalindrome(String s) {
        char[] ch = s.toCharArray();

        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            if (ch[i] != ch[j]) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
