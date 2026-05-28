class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        //brute force TLE  
        // List<String> ans= new ArrayList<>();
        // int j=0;
        // while(j+9<s.length()){
        //     String dna="";
        //     for(int i=j; i<j+10; i++){
        //         dna+=s.charAt(i);
        //     }
        //     int a=j+1;

        //     while(a+9<s.length()){
        //         int ind=0;
        //         boolean check=true;
        //         for(int k=a;k<a+10;k++){
        //             if(dna.charAt(ind)!=s.charAt(k)){
        //                 check=false;
        //                 break;
        //             }
        //             ind++;
        //         }
        //         if(check==true){
        //             if(!ans.contains(dna)){
        //                 ans.add(dna);
        //             }
        //         }
        //         a++;
        //     }
        //     j++;  
        // }
        // return ans;

        List<String> ans= new ArrayList<>();
        HashSet<String> dups= new HashSet<String>();
        

        // String dna=""
        // for(int j=0; j<10;j++){
        //     dna+=s.charAt(j);
        // }
        // dups.add(dna)
        int i=0;
        int j=10;
        while(i+9<s.length()){
            String dna=s.substring(i,j);
            if(dups.contains(dna)){
                if(!ans.contains(dna)){
                    ans.add(dna);
                }
            }
            dups.add(dna);
            i++;
            j++;
        }
        return ans;
    }
}