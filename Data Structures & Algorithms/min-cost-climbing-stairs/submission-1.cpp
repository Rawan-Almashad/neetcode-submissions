class Solution {
   public:
    int dp[105];
    int solve(int idx, vector<int>& cost) {
        if (idx == cost.size() - 1) return cost[idx];
        if (idx > cost.size() - 1) return 0;
        int& ret = dp[idx];
        if (ret != -1) return ret;
        ret = 1e9;
        ret = min(ret, solve(idx + 1, cost) + cost[idx]);
        ret = min(ret, solve(idx + 2, cost) + cost[idx]);
        return ret;
    }
    int minCostClimbingStairs(vector<int>& cost) {
        for (int i = 0; i <= cost.size(); i++) {
            dp[i] = -1;
        }
        return min(solve(0, cost), solve(1, cost));
    }
};
