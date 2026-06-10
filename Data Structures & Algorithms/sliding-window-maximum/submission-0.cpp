class Solution {
   public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        multiset<int> st;
        vector<int> ans;
        int j = 0;
        for (int i = 0; i < nums.size(); i++) {
            st.insert(nums[i]);
            if (i >= (k - 1)) {
                ans.push_back(*st.rbegin());
                st.erase(st.find(nums[j]));
                j++;
            }
        }
        return ans;
    }
};
