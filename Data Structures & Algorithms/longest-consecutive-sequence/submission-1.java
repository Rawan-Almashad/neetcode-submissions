class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            st.add(nums[i]);
        }
        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!st.contains(nums[i] - 1)) {
                cnt = 1;
                int cur = nums[i] + 1;
                while (st.contains(cur)) {
                    cnt++;
                    cur++;
                }
                ans = Math.max(ans, cnt);
            }
        }
        return ans;
    }
}
