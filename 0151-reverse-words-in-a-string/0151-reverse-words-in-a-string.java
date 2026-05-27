class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        int start = 0;
        int end = parts.length-1;

        while(start<end) {
            String temp = parts[start];
            parts[start]=parts[end].trim();
            parts[end]=temp.trim();
            start++;
            end--;
        }
        return String.join(" ", parts);
    }
}