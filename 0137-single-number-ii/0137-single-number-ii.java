class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int one = 0;
        int two = 0;

        for(int i=0;i<nums.length;i++)
        {
            one = (one ^ nums[i]) & (~two);
            two = (two ^ nums[i]) & (~one);
        }
        return one;
        
    }
}


// this method is like make a array sequence can be used but taking more time 

// int ans = -1;
//         for(int i=1;i<nums.length;i+=3)
//         {
//             if(nums[i] != nums[i-1])
//             {
//                 if(nums[i] != nums[i-1])
//                 {
//                     ans = nums[i-1];
//                 }
                
//                 break;
//             }
//         }
//         if(ans == -1)
//         {
//             ans = nums[nums.length-1];
//         }

            // return ans;