class Solution {
   public:
    int dp[50];
    int solve(int idx, int n) {
        if (idx == n) return 1;
        int &ret = dp[idx];
        if (ret != -1) return ret;
        ret = 0;
        if (idx + 1 <= n) ret += solve(idx + 1, n);
        if (idx + 2 <= n) ret += solve(idx + 2, n);
        return ret;
    }
    int climbStairs(int n) {
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return solve(0, n);
    }
};
