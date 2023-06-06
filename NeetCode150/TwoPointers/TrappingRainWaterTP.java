class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int i = 0;
        int j = height.length - 1;
        int leftMax = 0;
        int righMax = 0;

        while (i <= j) {
            if (leftMax <= righMax) {
                if (leftMax - height[i] > 0) ans += leftMax - height[i];
                leftMax = Math.max(leftMax, height[i]);
                i++;
            } else {
                if (righMax - height[j] > 0) ans += righMax - height[j];
                righMax = Math.max(righMax, height[j]);
                j--;
            }
        }
        
        return ans;
    }
}
