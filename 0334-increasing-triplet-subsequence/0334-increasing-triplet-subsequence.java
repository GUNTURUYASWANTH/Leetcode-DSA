class Solution {
    public boolean increasingTriplet(int[] nums) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;

        for(int num:nums)
        {
            if(num>x)
            {
                return true;
            }
            if(num <= y)
            {
                y = num ;
            }
            else
            {
                x = num ;
            }
        }
        return false;
    }
}