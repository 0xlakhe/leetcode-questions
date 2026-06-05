class Solution {
    public int countGoodSubstrings(String s) {
        int[] map=new int[26];
        int left=0;
        int right=0;
        if(s.length()<3){
            return 0;
        }
        while(right<3){
            char c=s.charAt(right);
            map[c-'a']+=1;
            right++;
        }
        int ans=0;
        boolean check=true;
        for(int i=0; i<26;i++){
            if(map[i]>1){
                check=false;
            }
        }
        if(check==true){
            ans+=1;
        }
        while(right<s.length()){
            char cRight=s.charAt(right);
            char cLeft= s.charAt(left);
            map[cLeft-'a']--;
            map[cRight-'a']++;
            right++;
            left++;
            boolean checker=true;
            for(int j=0;j<26;j++){
                if(map[j]>1){
                    checker=false;
                }
            }
            if(checker==true){
                ans+=1;
            }
        }
        return ans;
    }
}