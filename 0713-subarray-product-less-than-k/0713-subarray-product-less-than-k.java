class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // int ans=0;
        // ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     int mul=1;
        //     for(int j=i;j<nums.length;j++){
        //         mul*=nums[j];
        //         if(mul<k){
        //             ans+=1;
        //         }else{
        //             break;
        //         }

        //     }
        // }
        // return ans;

        if(k<=1){
            return 0;
        }
        int ans=0;
        int mul=1;
        int left=0;
        for(int right=0; right<nums.length;right++){
            mul*=nums[right];
            while(mul>=k){
                mul/=nums[left];
                left++;
            }
            ans+=(right-left+1);
        }
        return ans;
    }
}