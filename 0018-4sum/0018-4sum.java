class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int x=j+1;
                int y=nums.length-1;
                while(x<y){
                    long sum=(long)nums[i]+nums[j]+nums[x]+nums[y];
                    if(sum==target){
                        List<Integer> list= Arrays.asList(nums[i],nums[j],nums[x],nums[y]);
                        Collections.sort(list);
                        if(!res.contains(list)){
                            res.add(list);
                        }
                        y--;
                        x++;
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