class Solution {
    public int divisorSubstrings(int num, int k) {
        String sNum= String.valueOf(num);
        int ans=0;
        int n=sNum.length();
        for(int i=0; i<=n-k;i++){
            int div= Integer.parseInt(sNum.substring(i,i+k));
            if(div!=0&&num%div==0){
                ans+=1;
            }
        }
        return ans;
    }
}