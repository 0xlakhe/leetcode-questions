class Solution {
    public int strStr(String haystack, String needle) {


        for(int i=0;i<haystack.length();i++){
            int l=i;
            int r=l+needle.length()-1;
            int count=0;
            while(l<=r && r<haystack.length()){
                if(haystack.charAt(l)==needle.charAt(count)){
                    l+=1;
                    count+=1;
                }else{
                    break;
                }
            }
            if(count==needle.length()){
                return i;
            }
        }
        return -1;
        
    }   
}