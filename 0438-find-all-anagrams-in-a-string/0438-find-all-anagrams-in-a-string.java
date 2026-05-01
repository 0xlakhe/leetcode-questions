class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] sFreq=new int[26];
        int[] pFreq=new int[26];
        ArrayList<Integer> indexes=new ArrayList<>();

        if(p.length()>s.length()){
            return indexes;
        }

        for(int i=0;i<p.length();i++){
            sFreq[s.charAt(i)-'a']++;
            pFreq[p.charAt(i)-'a']++;
        }

        if(Arrays.equals(sFreq, pFreq)){
            indexes.add(0);
        }

        for(int j=p.length();j<s.length();j++){
            sFreq[s.charAt(j)-'a']++;
            sFreq[s.charAt(j-p.length())-'a']--;

            if(Arrays.equals(sFreq, pFreq)){
                indexes.add(j-p.length()+1);
            }
        }
        return indexes;
    }
}