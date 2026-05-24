class Solution {
    public int[] singleNumber(int[] nums) {
        int x = Arrays.stream(nums).reduce(0,(result,i)->result ^ i);
        int rightMost = x & (-x); // Which give the set value from last to first
        int b1 = 0;
        int b2 = 0;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i] & rightMost) != 0)
            {
                b1 = b1 ^ nums[i];
                continue;
            }
            b2 = b2 ^ nums[i];
            
        }

        return new int[]{b1,b2};
    }
}