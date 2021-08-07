class Solution {
    public boolean isAnagram(String s, String t) {
        int f[]=new int[100];
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)-'a']++;
            f[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(f[i]!=0) return false;
        }
        return true;
    }
}
