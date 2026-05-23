class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                pre[i] = nums[i];
            } else {
                pre[i] = nums[i] * pre[i - 1];
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                suf[i] = nums[i];
            } else {
                suf[i] = nums[i] * suf[i + 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int p = 1;
            int s = 1;
            if (i - 1 >= 0) {
                p = pre[i - 1];
            }
            if (i + 1 < nums.length) {
                s = suf[i + 1];
            }
            ans[i] = p * s;
        }
        return ans;
    }
}
