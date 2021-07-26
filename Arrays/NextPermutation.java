class Solution {
    public void nextPermutation(int[] nums) {
        int p=-1;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i-1]<nums[i])
            {
                p=i-1;
                break;
            }
        }
        if(p==-1)
        {
            reverse(nums,0,nums.length-1);
            return;
}
        int q=nums.length-1;
            for(int i=nums.length-1;i>=p+1;i--)
        {
            if(nums[i]>nums[p])
            {
               q=i;
                break;
            }
        }
       
     swap(nums,p,q);
        reverse(nums,p+1,nums.length-1);
       
        
    }
    public static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void reverse(int a[],int i,int j)
    {
        while(i<j)
        {
            swap(a,i,j);
            i++;
            j--;
        }
    }
}
