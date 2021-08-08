class Solution {
    public int countPrimes(int n) {
        int s[]= new int[n+1];
        if(n==2) return 0;
        for(int i=2;i*i<=n;i++){
            if(s[i]==0){
                for(int j=i*i;j<=n;j=j+i){
                    s[j]=1;
                }
            }
        }
        int res=0;
        for(int i=2;i<n;i++){
            if(s[i]==0){
                res=res+1;
            }
        }
        return res;
        
    }
}
