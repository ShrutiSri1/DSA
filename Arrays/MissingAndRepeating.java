class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int res[]=new int[2];
        int f[]= new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(f[arr[i]]!=0)
            {
                res[0]=arr[i];
            }
            f[arr[i]]++;
        }
        for(int i=0;i<=n;i++)
        {
            if(f[i]==0)
            {
                res[1]=i;
            }
        }
        return res;
    }
}

/////
  class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int res[]=new int [2];
      
            
    long sum=n*(n+1)/2;
    long sum2=(n*(n+1)*(2*n+1))/6;
    for(int i=0;i<n;i++){
        
        sum=sum-arr[i];
        sum2=sum2-arr[i]*arr[i];
    }
    long  missing=0;
    long repeating=0;
    missing=(sum+sum2/sum)/2;
    repeating=missing-sum;
    res[0]=(int)repeating;
    res[1]=(int)missing;
    
        return res;
        
    }
}


