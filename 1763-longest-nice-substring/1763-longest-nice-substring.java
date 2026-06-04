class Solution {
    public String helper(int start, int mid, String s){

        HashSet<Character> map= new HashSet<>();
        int n=mid;
        for(int i=start;i<n;i++){
            map.add(s.charAt(i));
        }

        int index=start;
        while(index<n){
            char c= s.charAt(index);
            char partner;
            if(c>='a' && c<='z'){
                partner=(char)(c-32);
            }else{
                partner=(char)(c+32);
            }
            if(!map.contains(partner)){
                break;
            }
            index++;
        }
        if(index>=mid){
            return s.substring(start,mid);
        }
        String leftString= helper(start, index, s);
        String rightString= helper(index+1, n, s);
        
        return leftString.length()>=rightString.length()?leftString:rightString;
    }


    public String longestNiceSubstring(String s) {
        //brute force
        // int n=s.length();
        // String ans="";
        // for(int i=0; i<n;i++){
        //     boolean[] small= new boolean[26];
        //     boolean[] big= new boolean[26];
        //     for(int j=i;j<n;j++){
        //         char c=s.charAt(j);
        //         if(c>='a' && c<='z'){
        //             small[c-'a']=true;
        //         }
        //         if(c>='A' && c<='Z'){
        //             big[c-'A']=true;
        //         }
        //         boolean check=true;
        //         for(int k=0;k<26;k++){
        //             if(small[k]!=big[k]){
        //                 check=false;
        //             }
        //         }
        //         if(check==true){
        //             String res=s.substring(i,j+1);
        //             if (res.length()>ans.length()){
        //                 ans=res;
        //             }
        //         }
        //     }
        // }
        // return ans;

        return helper(0, s.length(), s);
    }
}