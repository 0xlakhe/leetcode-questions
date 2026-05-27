class Solution {
    public String reverseWords(String s) {
        String[] parts = s.split(" ");
        int start = 0;
        int end = parts.length-1;

        while(start<end) {
            if(parts[start]==null || parts[start].length()==0){
                start++;
                continue;
            }
            if(parts[end]==null || parts[end].length()==0){
                end--;
                continue;
            }
            String temp = parts[start];
            parts[start]=parts[end].trim();
            parts[end]=temp.trim();
            start++;
            end--;
        }
        String ans="";
        for(String word: parts){
            if(word.length()==0){
                continue;
            }
            ans+=word+ " ";
        }
        ans=ans.trim();
        return ans;
    }
}