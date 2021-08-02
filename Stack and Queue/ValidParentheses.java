lass Solution {
    public boolean isValid(String s) {
      if(s.length()==1) return false;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='('||a=='['||a=='{')
            {
                stack.push(a);
            }
            else{
                 if(stack.empty()) return false;
            char p=stack.peek();
                stack.pop();
            if(p=='('&& a!=')')
                return false;
           if(p=='['&& a!=']')
                return false;
                if(p=='{'&& a!='}')
                return false;
        }
        }
        return stack.empty();
    }
}
