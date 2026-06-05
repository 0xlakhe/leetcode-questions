class Solution {
    public int countGoodSubstrings(String s) {
        int left=0;
        int right=2;
        if(s.length()<3){
            return 0;
        }
        int ans=0;
        boolean check=true;
        while(right<s.length()){
            if(s.charAt(left)!=s.charAt(left+1)&& s.charAt(left+1)!=s.charAt(right)&&s.charAt(left)!=s.charAt(right)){
                ans+=1;
            }
            right++;
            left++;
        }
        return ans;
    }
}