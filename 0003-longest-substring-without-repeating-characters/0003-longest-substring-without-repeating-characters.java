class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            HashSet<Character> characters=new HashSet<>();
            int count=0;
            for(int j=i;j<s.length();j++){
                if(characters.contains(s.charAt(j))){
                    break;
                }
                characters.add(s.charAt(j));
                count+=1;
            }
            if(count>longest){
                longest=count;
            }
        }
        
        return (longest==Integer.MIN_VALUE)?0:longest;
    }
}