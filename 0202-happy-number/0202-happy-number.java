class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(true)
        {
            int sum = 0;
            while(n>0)
            {
                n = numSquareSum(n);
                if(n == 1)
                {
                    return true;
                }
                if(set.contains(n))
                    return false;
                set.add(n);
            }
        }
    }
        public static int numSquareSum(int num)
        {
        int sum = 0;
        while(num>0)
        {
            sum += (num%10) * (num%10);
            num = num / 10;
        }
        return sum;
        } 
    
}