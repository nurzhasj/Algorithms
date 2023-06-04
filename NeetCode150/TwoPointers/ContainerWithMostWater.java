class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int res = 0;

        while (i < j) {
            int dist = j - i;

            int waterSq = dist * Math.min(height[i], height[j]);

            res = Math.max(res ,waterSq);

            if (height[i] < height[j]) i++;
            else j--;
        }

        return res;
    }
}
