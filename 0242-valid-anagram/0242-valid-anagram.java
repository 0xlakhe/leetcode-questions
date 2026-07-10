class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return  false;
        }
        int[] sMap=new int[26];
        int[] tMap=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char ch=t.charAt(i);
            sMap[c-'a']++;
            tMap[ch-'a']++;

        }

        for (int k=0;k<sMap.length;k++){
            if (sMap[k]!=tMap[k]){
                return false;
            }
        }
        return true;
    }
}