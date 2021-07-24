//LeetCode287. Find the Duplicate Number
class Solution {
    public int findDuplicate(int[] nums) {
       
        int f[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(f[nums[i]]!=0)
                return nums[i];
            f[nums[i]]++;
        }
        
        return -1;
        
    }
}
