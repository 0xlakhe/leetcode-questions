class Solution {
    HashMap<Integer,Integer> map= new HashMap<>();
    
    public int fib(int n) {
        return calc(n);

    }

    public int calc(int i){
        if(i==0||i==1){
            return i;
        }
        if(map.containsKey(i)){
            return map.get(i);
        }
        map.put(i,fib(i-1)+fib(i-2));
        return map.get(i);
    }
}