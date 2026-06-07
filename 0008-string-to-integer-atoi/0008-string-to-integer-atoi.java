class Solution {
    public int myAtoi(String s) {
        String nums = s.trim();
        if (nums.isEmpty()) return 0;
        
        int sign = 1;
        int index = 0;
        
        if (nums.charAt(0) == '+') {
            index++;
        } else if (nums.charAt(0) == '-') {
            sign = -1;
            index++;
        }
        
        long result = 0; 
        
        while (index < nums.length() && Character.isDigit(nums.charAt(index))) {
            int digit = nums.charAt(index) - '0'; 
            
            result = (result * 10) + digit;
                        if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
            index++;
        }
        
        return (int) (sign * result);
    }
}