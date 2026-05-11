class Solution {

    private void combinations(int index, int[] candidates, int target, List<List<Integer>> res, List<Integer> empty){
        if(index==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(empty));
            }
            return;
        }
        if(candidates[index]<=target){
            empty.add(candidates[index]);
            combinations(index,candidates,target-candidates[index],res,empty);
            empty.remove(empty.size()-1);
        }
        combinations(index+1,candidates,target,res,empty);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        combinations(0,candidates,target,res,new ArrayList<>());
        return res;
    }
}