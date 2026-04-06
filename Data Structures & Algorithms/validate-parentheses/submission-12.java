class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack();

        if( s.length() < 2){
            return false;
        }

        for(int i = 0; i < s.length(); i++){

            // if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                // stack.push(s.charAt(i));
                // continue;
            // }

            // System.out.println(s.charAt(i)+" "+stack.peek());
            if(!stack.empty() && ((s.charAt(i) == ')' && stack.peek() == '(' ) || (s.charAt(i) == '}' && stack.peek() == '{') || (s.charAt(i) == ']' && stack.peek() == '['))){
                stack.pop();
            } else{
                stack.push(s.charAt(i));
                continue;
            }
        }

        return stack.empty();
    }
}
