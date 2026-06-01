class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int max = 0;
        int count = 0;
        for(int num : nums)
        {
            if(num==1)
            {
                count++;
                max = Math.max(count,max);
            }
            else
            {
                count = 0;
            }
        }
        return max;
    }
}