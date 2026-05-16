class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = -1;
        for(int i=1;i<nums.length;i+=3)
        {
            if(nums[i] != nums[i-1])
            {
                if(nums[i] != nums[i-1])
                {
                    ans = nums[i-1];
                }
                
                break;
            }
        }
        if(ans == -1)
        {
            ans = nums[nums.length-1];
        }

        return ans;
    }
}