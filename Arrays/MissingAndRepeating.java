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


