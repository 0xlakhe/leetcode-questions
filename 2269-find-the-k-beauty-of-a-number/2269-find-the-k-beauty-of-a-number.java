class Solution {
    public int divisorSubstrings(int num, int k) {
        String sNum= String.valueOf(num);
        int right=k;
        int left=0;
        int ans=0;
        int n=sNum.length();
        while(right<=n){
            while(right<n && sNum.charAt(left)== '0' ){
                left++;
                right++;
            }
            int div = Integer.parseInt(sNum.substring(left,right));
            if(div!=0 && num%div==0){
                ans+=1;
            }
            left++;
            right++;
        }
        return ans;
    }
}