class Solution {
    public double myPow(double x, int n) {    
        long N=n;
        if(n<0){
            x=1/x;
            N=-N;
        }
        return helper(x,N);
    }
    public double helper(double x,long n){
        if(n==0){
            return 1;
        }
        double ans=helper(x,n/2);
        ans*=ans;
        return n%2!=0?ans*x:ans;
    }
}