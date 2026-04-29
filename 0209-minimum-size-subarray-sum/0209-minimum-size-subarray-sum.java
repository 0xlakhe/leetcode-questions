class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // Brute force
        // int minCount=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         count+=1;
        //         if(sum>=target){
        //             if(count<minCount){
        //                 minCount=count;
        //             }
        //             break;
        //         }
        //     }
        // }
        // if(minCount==Integer.MAX_VALUE){
        //     return 0;
        // }
        // return minCount;
        int j=0;
        int i=0;
        int minCount=Integer.MAX_VALUE;
        int sum=0;
        int count=0;
        while(i<nums.length && j<=nums.length){
            if(sum<target){
                if(j<nums.length){
                sum+=nums[j];
                j++;
                count++;}else{
                    break;
                }
            }
            if(sum>=target){
                if(count<minCount){
                    minCount=count;
                }
                sum=sum-nums[i];
                i++;
                count--;
            }
        }

        
        if(minCount==Integer.MAX_VALUE){
            return 0;
        }

        return minCount;
    }
}