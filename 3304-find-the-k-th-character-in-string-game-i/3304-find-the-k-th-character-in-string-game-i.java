class Solution {
    String s="a";
    public char kthCharacter(int k) {
        if(s.length()>=k){
            return s.charAt(k-1);
        }
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==122){
                s+='a';
                continue;
            }
            s+=(char)(s.charAt(i)+1);
        }
        return kthCharacter(k);
    }
}