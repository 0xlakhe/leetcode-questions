class Solution {
    public int lastRemaining(int n) {
        return helper(1,n,1,true);
    }
    public int helper(int start, int n, int step, boolean leftToRight){
        if(n==1){
            return start;
        }
        if(leftToRight==true || n%2!=0){
            start=start+step;
        }
        return helper(start,n/2,step*=2,!leftToRight);
    }
}