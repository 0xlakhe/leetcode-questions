class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int index=0;
        boolean check=false;
        ArrayList<Integer> points=new ArrayList<>();

        if(p.length()>s.length()){
            return points;
        }
        int[] characters=new int[26];

        for(Character character:p.toCharArray()){
            characters[character-'a']+=1;
        } 

        int[] toCompare=new int[26];
        for(int i=0;i<p.length();i++){
            Character letter=s.charAt(i);
            toCompare[letter-'a']+=1;
        }


        
        for(int j=p.length();j<=s.length();j++){
            if(Arrays.equals(characters, toCompare)){
                points.add(index);
            }
            Character toRemove=s.charAt(index);
            toCompare[toRemove-'a']-=1;
            index++;
            if(j<s.length()){
                Character toAdd=s.charAt(j);
                toCompare[toAdd-'a']+=1;
            }else{
                break;
            }
        }
        return points;
    }
}