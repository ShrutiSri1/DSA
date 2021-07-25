
//LeetCode 75. Sort Colors
class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int mid=0;
        int temp;
        while(mid<=h)
        {
            switch(nums[mid])
            {
                case 0:
                    temp=nums[l];
                    nums[l]=nums[mid];
                    nums[mid]=temp;
                    mid++;
                    l++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                      temp=nums[h];
                    nums[h]=nums[mid];
                    nums[mid]=temp;
                  h--;
                    break;
            }
        }

        
    }
}
