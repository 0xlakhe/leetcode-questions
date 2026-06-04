class Solution {
    public String longestNiceSubstring(String s) {

        int n=s.length();
        String ans="";
        for(int i=0; i<n;i++){
            boolean[] small= new boolean[26];
            boolean[] big= new boolean[26];
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                if(c>='a' && c<='z'){
                    small[c-'a']=true;
                }
                if(c>='A' && c<='Z'){
                    big[c-'A']=true;
                }
                boolean check=true;
                for(int k=0;k<26;k++){
                    if(small[k]!=big[k]){
                        check=false;
                    }
                }
                if(check==true){
                    String res=s.substring(i,j+1);
                    if (res.length()>ans.length()){
                        ans=res;
                    }
                }
            }
        }
        return ans;
    }
}