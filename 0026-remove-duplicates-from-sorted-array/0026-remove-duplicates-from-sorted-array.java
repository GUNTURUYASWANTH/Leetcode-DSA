class Solution {
    public int removeDuplicates(int[] nums) {
      int index= 1;
      int j = 0;
      for(int i=0;i<nums.length-1;i++)
      {
        if(nums[i]!=nums[i+1])
        {
            nums[index++] = nums[i+1];
        }
      }  
      return index;
    }
}

// Using Hash set 
// HashSet<Integer> set = new HashSet<>();
//         int index = 0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(!set.contains(nums[i]))
//             {
//                 set.add(nums[i]);
//                 nums[index++] = nums[i];
//             }
//         }
//         return set.size();