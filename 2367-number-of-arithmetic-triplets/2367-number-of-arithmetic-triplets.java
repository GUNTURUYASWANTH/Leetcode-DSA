class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> hs = new HashSet<>();

        for(int x:nums)
        {
            hs.add(x);
        }

        int count = 0;
        for(int num:nums)
        {
            if(hs.contains(num + diff) && hs.contains(num + diff*2))
            {
                count++;
            }
        }
        return count;
    }
}