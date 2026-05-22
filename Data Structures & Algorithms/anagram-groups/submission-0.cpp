class Solution {
   public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> ans;
        map<string, int> idx;
        int cur = 0;
        for (int i = 0; i < strs.size(); i++) {
            string temp = strs[i];
            sort(temp.begin(), temp.end());
            if (idx[temp] == 0) {
                ans.push_back({strs[i]});
                cur++;
                idx[temp] = cur;
            } else {
                ans[idx[temp] - 1].push_back(strs[i]);
            }
        }
        return ans;
    }
};
