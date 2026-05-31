class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];
        int freq2[] = new int[26];
        for (int i = 0; i < 26; i++) {
            freq[i] = 0;
            freq2[i] = 0;
        }
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int j = 0;
        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
            while (freq2[s2.charAt(i) - 'a'] > freq[s2.charAt(i) - 'a']) {
                freq2[s2.charAt(j) - 'a']--;
                j++;
            }
            if (i - j + 1 == s1.length())
                return true;
        }
        return false;
    }
}
