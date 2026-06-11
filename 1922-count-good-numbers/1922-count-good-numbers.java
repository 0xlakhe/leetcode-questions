class Solution {
    public int countGoodNumbers(long n) {
        long evenSlots=(n+1)/2;
        long oddSlots=n/2;
        long mod = 1_000_000_007;
        //from 0 to 9 there are 5 even numbers, 0,2,4,6,8 so even slots can always have 5 combinations
        long evenComs=helper(5,evenSlots);
        //becuase from 0 to 9 there are 4 prime numbers, 2,3,5,7
        long oddComs= helper(4,oddSlots);
        long total= (evenComs*oddComs)%mod;
        return (int)total;
    }
    
    public long helper(long number, long totalCombination){
        if(totalCombination==0){
            return 1;
        }
        long mod = 1_000_000_007;
        long ans=helper(number,totalCombination/2);
        ans=(ans*ans)%mod;
        if(totalCombination%2!=0){
            ans=(ans*number)%mod;
        }
        return ans;
    }
}