class Solution {
    public int maxSubArray(int[] nums) {
        int prevSum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            prevSum=prevSum+nums[i];
            ans=Math.max(ans,prevSum);
            if(prevSum<0){
                prevSum=0;
            }
        }
        return ans;
    }
}
