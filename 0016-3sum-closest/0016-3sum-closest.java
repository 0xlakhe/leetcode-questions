class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //brute force;
        // int ans= Integer.MAX_VALUE;
        // int result=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             int sum=nums[i]+nums[j]+nums[k];
        //             int diff=Math.abs(target-sum);
        //             if(diff<ans){
        //                 ans=diff;
        //                 result=sum;
        //             } 
        //         }
        //     }
        // }
        // return result;
        int ans=Integer.MAX_VALUE;
        int result=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum= nums[i]+nums[j]+nums[k];   
                int diff= Math.abs(sum-target);
                if(diff<ans){
                    ans=diff;
                    result=sum;
                }
                if(sum>target){
                    k-=1;
                }else{
                    j+=1;
                }
            }
        }
        return result;
    }
}