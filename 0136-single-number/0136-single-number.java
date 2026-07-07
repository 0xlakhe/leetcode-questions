class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int num:nums){
            map.putIfAbsent(num,0);
            map.put(num,map.get(num)+1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return 0;
    }
}