class Solution {
    public String intToRoman(int num) {
        int intval[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String code[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder s=new StringBuilder();
        for(int i=0;i<code.length;i++){
            while(num>=intval[i]){
                s.append(code[i]);
                num=num-intval[i];
                
            }
        }
        return s.toString();
        
    }
}
