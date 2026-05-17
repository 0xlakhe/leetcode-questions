class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j!=i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int x=j+1;
                int y=nums.length-1;
                while(x<y){
                    long sum=(long)nums[i]+nums[j]+nums[x]+nums[y];
                    if(sum==target){
                        List<Integer> list= Arrays.asList(nums[i],nums[j],nums[x],nums[y]);
                        res.add(list);
                        x++;
                        y--;
                        while(x<y && nums[x]==nums[x-1]){
                            x++;
                        }
                        while(x<y && nums[y]==nums[y+1]){
                            y--;
                        }
                    }else if(sum>target){
                        y--;
                    }else{
                        x++;
                    }
                }
            }
        }
        return res;
    }
}