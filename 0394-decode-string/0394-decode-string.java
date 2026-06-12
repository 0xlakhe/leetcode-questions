class Solution {
    public String decodeString(String s) {
        Deque<Integer> countStack=new ArrayDeque<>();
        Deque<String> stringStack= new ArrayDeque<>();
        String currentString="";
        int currentNumber=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                currentNumber=currentNumber*10+(ch-'0');
            }else if(Character.isLetter(ch)){
                currentString+=ch;
            }else if(ch=='['){
                countStack.push(currentNumber);
                stringStack.push(currentString);
                currentNumber=0;
                currentString="";
            }else if(ch==']'){
                int repeat=countStack.pop();
                String prev=stringStack.pop();
                StringBuilder temp=new StringBuilder();
                for(int j=0;j<repeat;j++){
                    temp.append(currentString);
                }
                currentString=prev+temp.toString();
            }
        }
        return currentString;
    }
}