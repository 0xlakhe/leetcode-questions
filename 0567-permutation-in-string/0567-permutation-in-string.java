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
        boolean check1=true;
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                check1=false;
            }
        }
        if(check1==true){
            return true;
        }
        int i=0;
        int j=s1.length();
        while(j<s2.length()){
            freq2[s2.charAt(i)-'a']-=1;
            freq2[s2.charAt(j)-'a']+=1;
            boolean check=true;
            for(int k=0; k<26;k++){
                if(freq1[k]!=freq2[k]){
                    check=false;
                }
            }
            if(check==true){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}