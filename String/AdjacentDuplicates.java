class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> s = new Stack<>();
        for(char c: S.toCharArray()){
            if(!s.isEmpty()&& s.peek()==c)
                s.pop();
            else
                s.push(c);
        }
        StringBuilder res=new StringBuilder();
        for(char c: s) res.append(c);
        return res.toString();
        
    }
}
