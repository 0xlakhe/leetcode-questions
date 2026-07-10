class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return  false;
        }
        int[] sMap=new int[26];

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for(int i=0;i<s.length();i++){
            sMap[sChars[i]-'a']++;
            sMap[tChars[i]-'a']--;
        }
        for(int val:sMap){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}