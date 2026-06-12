class Solution {
    public String decodeString(String s) {
        // brute force
        // Deque<Integer> countStack=new ArrayDeque<>();
        // Deque<String> stringStack= new ArrayDeque<>();
        // String currentString="";
        // int currentNumber=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(Character.isDigit(ch)){
        //         currentNumber=currentNumber*10+(ch-'0');
        //     }else if(Character.isLetter(ch)){
        //         currentString+=ch;
        //     }else if(ch=='['){
        //         countStack.push(currentNumber);
        //         stringStack.push(currentString);
        //         currentNumber=0;
        //         currentString="";
        //     }else if(ch==']'){
        //         int repeat=countStack.pop();
        //         String prev=stringStack.pop();
        //         String repeated=currentString.repeat(repeat);
        //         currentString=prev+repeated;
        //     }
        // }
        // return currentString;
        int[] index=new int[]{0};
        return decode(s,index);
    }

    String decode(String s, int[] i){
        StringBuilder currentString=new StringBuilder();
        int num=0;
        while(i[0]<s.length()&& s.charAt(i[0])!=']'){
            char ch=s.charAt(i[0]);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
                i[0]++;
            }else if(Character.isLetter(ch)){
                currentString.append(ch);
                i[0]++;
            }else if(ch=='['){
                i[0]++;
                String inner=decode(s,i);
                for(int j=0;j<num;j++){
                    currentString.append(inner);
                }
                num=0;
            }
        }

        i[0]++;
        return currentString.toString();
    }
}