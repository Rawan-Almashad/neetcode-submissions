class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        int cur=k;
        int st=0;
       for(char i='A';i<='Z';i++)
        {
            st=0;
            cur=k;
            for(int j=0;j<s.length();j++)
            {
                char c=s.charAt(j);
                if(c!=i)
                {
                    cur--;
                }
                while(cur<0)
                {
                    char ch=s.charAt(st);
                    if(ch!=i)
                    cur++;
                    st++;
                }
                ans=Math.max(ans,j-st+1);
            }
        }
        return ans;
    }
}
