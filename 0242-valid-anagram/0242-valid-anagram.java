class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return  false;
        }
        int[] sMap=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char ch=t.charAt(i);
            sMap[c-'a']++;
            sMap[ch-'a']--;

        }
        for(int val:sMap){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}