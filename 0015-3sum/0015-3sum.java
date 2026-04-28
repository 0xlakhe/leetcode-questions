class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> numbers=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int target=nums[i];
            int left=i+1;
            int right=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            
            while(left<right){
                List<Integer> ans=new ArrayList<>();
                if(nums[left]+nums[right]+target==0){
                    ans.add(target);
                    ans.add(nums[left]);
                    ans.add(nums[right]);
                    numbers.add(ans);
                    left++;
                    right--;
                    while(left<nums.length&&nums[left]==nums[left-1]) {
                        left++;
                    }
                    
                    while(right>=0 && nums[right]==nums[right+1] ){
                        right--;
                    }
                }else if(nums[left]+nums[right]+target<0){
                    left++; 
                }else if(nums[left]+nums[right]+target>0){
                    right--;
                }
            }
        }

        return numbers;
    }
}