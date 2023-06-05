class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int[] res = new int[len];
        int ans = 0;

        int maxLeft = 0;
        left[0] = maxLeft;
        for (int i = 1; i < len; i++) {
            maxLeft = Math.max(maxLeft, height[i - 1]);
            left[i] = maxLeft;
        }

        int maxRight = 0;
        right[len - 1] = maxRight;
        for (int i = len - 2; i >= 0; i--) {
            maxRight = Math.max(maxRight, height[i + 1]);
            right[i] = maxRight;
        }

        for (int i = 0; i < len; i++) {
            res[i] = Math.min(left[i], right[i]) - height[i];
        }

        for (int i = 0; i < len; i++) {
            if (res[i] > 0) ans += res[i];
        }

        return ans;
    }
}
