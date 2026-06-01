class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] freq1=  new int[26];
        int[] freq2= new int[26];

        if(s1.length()>s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            char letter1= s1.charAt(i);
            char letter2=s2.charAt(i);
            freq1[letter1- 'a']+=1;
            freq2[letter2-'a']+=1;
        }
        int matches=0;
        for(int i=0;i<26;i++){
            if(freq1[i]==freq2[i]){
                matches+=1;
            }
        }
        if(matches==26){
            return true;
        }
        int i=0;
        int j=s1.length();
        while(j<s2.length()){
            int leftIdx=s2.charAt(i)-'a';
            int rightIdx=s2.charAt(j)-'a';

            if(freq2[leftIdx]==freq1[leftIdx]){
                matches--;
            }
            freq2[leftIdx]--;
            if(freq2[leftIdx]==freq1[leftIdx]){
                matches++;
            }

            if(freq1[rightIdx]==freq2[rightIdx]){
                matches--;
            }
            freq2[rightIdx]++;
            if(freq1[rightIdx]==freq2[rightIdx]){
                matches++;
            }

            if(matches==26){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}