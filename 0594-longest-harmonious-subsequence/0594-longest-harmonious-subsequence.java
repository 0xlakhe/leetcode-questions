class Solution {
    public int findLHS(int[] nums) {
        //brute
        // if (nums.length==0){
        //     return 0;
        // }
        // Arrays.sort(nums);
        // int right=1;
        // int left=0;
        // int count=0;
        // while(right<nums.length){
        //     int diff=nums[right]-nums[left];
        //     if(diff>1){
        //         left++;
        //     }else {
        //         if(diff==1){
        //             count=Math.max(count, right-left+1);
        //         }
        //         right++;
        //     }
        // }
        // return count;

        HashMap<Integer,Integer> freq=  new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i], 0)+1);
        }
        int ans=0;
        for(Integer key: freq.keySet()){
            if(freq.containsKey(key+1)){
                int length= freq.get(key)+ freq.get(key+1);
                if(length>ans){
                    ans=length;
                }
            }
        }
        return ans;
    }
}