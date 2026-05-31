class Solution {
    public int characterReplacement(String s, int k) {
        int[] map= new int[26];
        int left=0;
        int right=0;
        int maxfreq=0;
        int maxlen=0;

        while(right<s.length()){
            char r= s.charAt(right);
            map[r-'A']+=1;
            maxfreq=Math.max(maxfreq,map[r-'A']);
            while((right-left+1)-maxfreq>k){
                char l=s.charAt(left);
                map[l-'A']-=1;
                maxfreq=0;
                for(int i=0; i<map.length;i++){
                    maxfreq=Math.max(maxfreq,map[i]);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}