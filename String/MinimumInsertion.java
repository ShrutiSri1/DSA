class Solution {
    
    public int minInsertions(String s) {
        int n=s.length();
        int m[][]=new int[n+1][n+1];
        String t = new StringBuilder(s).reverse().toString();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++){
                if(i==0||j==0){
                    m[i][j]=0;
                }
                else if(s.charAt(i-1)==t.charAt(j-1)){
                    m[i][j] = m[i-1][j-1]+1;
                }
                else{
                    m[i][j]=Math.max(m[i-1][j],m[i][j-1]);
                }
            }
        }
        
        return n-m[n][n];
    }
}
