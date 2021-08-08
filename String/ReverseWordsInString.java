class Solution {
    public String reverseWords(String s) {
  
        if(s==null||s.length()<=0) return s;
        String[]ss=s.trim().split(" +");
        int l=ss.length;
        String res="";
        for(int i=l-1;i>=0;i--){
            if(i!=0){
                res=res+ss[i] +" ";
                
            }
            else{
                res=res+ss[i];
            }
        }
       
        return res;
    }
    
}
