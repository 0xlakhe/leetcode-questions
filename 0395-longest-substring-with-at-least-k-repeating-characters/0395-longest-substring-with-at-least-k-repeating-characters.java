class Solution {
    public int helper(String s,int start, int end, int k) {
        if(s.length()<k){
            return 0;
        }
        int[] freq= new int[26];
        for(int i =start; i<end;i++){
            freq[s.charAt(i)-'a']+=1;
        }
        int mid=start;
        while(mid<end){
            if(freq[s.charAt(mid)-'a']<k){
                int next=mid+1;
                while(next<end && freq[s.charAt(next)-'a']<k){
                    next++;
                }
                return Math.max(helper(s,start,mid,k), helper(s,next,end,k));
            }
            mid++;
        }
        return end-start;
    }
    
    public int longestSubstring(String s, int k){
        return helper(s,0, s.length(),k);
    }
}