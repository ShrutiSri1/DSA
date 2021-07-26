class Solution {
    public int maxProfit(int[] nums) {
       
        int sell=0,cost=0;
    int buy=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            buy=Math.min(nums[i],buy);
            cost=nums[i]-buy;
            sell=Math.max(cost,sell);
        }
        return sell;
     
}
}
