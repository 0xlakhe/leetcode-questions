class Solution {
    public boolean isPalindrome(int x) {
        String s= String.valueOf(x);
        int right=s.length()-1;
        int left=0;
        boolean check=false;
        while(left<=right){
            if (s.charAt(left)==s.charAt(right)){
                check=true;
            }else{
                return false;
            }
            left++;
            right--;
        }
        return check;
    }
}