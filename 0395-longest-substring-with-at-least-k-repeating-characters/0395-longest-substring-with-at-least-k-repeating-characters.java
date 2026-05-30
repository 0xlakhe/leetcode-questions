class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()<k){
            return 0;
        }
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i =0; i<s.length();i++){
            Character c= s.charAt(i);
            map.putIfAbsent(c, 0);
            map.put(c,map.get(c)+1);
        }
        int i=0;
        while(i<s.length()){
            if(map.get(s.charAt(i))<k){
                break;
            }
            i++;
        }
        if(i==s.length()){
            return i;
        }
        String leftSubstring = s.substring(0,i);
        String rightSubstring= s.substring(i+1,s.length());

        int leftResult= longestSubstring(leftSubstring, k);
        int rightResult= longestSubstring(rightSubstring, k);

        return Math.max(leftResult,rightResult);
    }
}