class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> idx = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            idx.put(nums[i], i + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (idx.containsKey(res) && idx.get(res) != i + 1) {
                ans[0] = i;
                ans[1] = idx.get(res) - 1;
                break;
            }
        }
        return ans;
    }
}
