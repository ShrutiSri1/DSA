class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        int res[]=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int k=target-nums[i];
            if(map.containsKey(k)){
                res[0]=i;
                res[1]=map.get(k);
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
