class Solution {
    public int[][] merge(int[][] intervals) {
       if(intervals.length==1)
           return intervals;
       Arrays.sort(intervals,(arr1,arr2)->arr1[0]-arr2[0]);
        List<int[]> res=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int[] i:intervals)
        {
            if(i[0]<=end)
            {
                end=Math.max(end,i[1]);
            }
            else{
                res.add(new int[]{start,end});
                start=i[0];
            end=i[1];
                }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
}
