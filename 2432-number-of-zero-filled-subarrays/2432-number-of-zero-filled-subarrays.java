class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long result = 0;
        long count = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                count++;
            }
            else
            {
                count=0;
            }
            result += count;
        }
        return result;
    }
    
}


// Long process what i logically written

// public long zeroFilledSubarray(int[] nums) {
//         int count = 0;
//         int n = nums.length;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=i;j<n;j++)
//             {
//                 if(nums[i]==0 && nums[j]==0)
//                 {
//                     if(Arrays.stream(subArray(nums,i,j)).allMatch(num->num==0))
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
//     public int [] subArray(int nums[],int start, int end)
//     {
//         int result[]= new int[end-start];
//         for(int i=start;i<end;i++)
//         {
//             result[i-start] = nums[i];
//         }
//         return result;
//     }
// }


// By using the sum of n elements we can solve it 
// public long zeroFilledSubarray(int[] nums) {
//         int n = nums.length;
//         int i=0;
//         long result = 0;
//         while(i<n)
//         {
//             long count = 0;
//             if(nums[i]==0)
//             {
//                 while(i<n && nums[i]==0)
//                 {
//                     count++;
//                     i++;
//                 }
//             }
//             else
//             {
//                 i++;
//             }
//             result += (count*(count+1))/2;
//         }
//         return result;
//     }