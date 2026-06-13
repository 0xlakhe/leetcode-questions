class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> ds= new ArrayList<>();
        boolean[] freq=new boolean[digits.length];
        HashSet<Integer> map=new HashSet<>();
        helper(digits,freq,ds,map);
        int[] res= map.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(res);
        return res;
    }

    public void helper(int[] digits, boolean[] freq, List<Integer>ds,HashSet<Integer>map){
        if(ds.size()>=1 && ds.get(0)==0){
            return;
        }
        if(ds.size()==3 && ds.get(2)%2!=0){
            return;
        }
        if(ds.size()==3 && ds.get(2)%2==0){
            int res=ds.get(0)*100+ ds.get(1)*10+ds.get(2);
            map.add(res);
            return;
        }
        for(int i=0;i<digits.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(digits[i]);
                helper(digits,freq,ds,map);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}