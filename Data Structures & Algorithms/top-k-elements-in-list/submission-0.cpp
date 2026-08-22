class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        int freq[2005]={0};
        pair<int,int>pa[2005];
        vector<int>ans;
        for(int i=0;i<nums.size();i++)
        {
            freq[nums[i]+1000]++;
        }
        for(int i=0;i<2005;i++)
        {
            pa[i].first=freq[i];
            pa[i].second=i;
        }
        sort(pa ,pa +2005);
        for(int i=2004;i>=0&&k>0;i--)
        {
            k--;
            ans.push_back(pa[i].second-1000);
        }
        return ans;
    }
};
