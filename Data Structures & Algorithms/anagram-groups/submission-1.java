class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, Integer> idx = new HashMap<>();
        for(String s:strs)
        {
            char []chars =s.toCharArray();
            Arrays.sort(chars);
            String temp = new String(chars);
            if (!idx.containsKey(temp))
            {
                 idx.put(temp, ans.size());
                List<String> newGroup = new ArrayList<>();
                newGroup.add(s);
                ans.add(newGroup);
            }
            else{
                ans.get(idx.get(temp)).add(s);
            }
        }
        return ans;
    }
}
