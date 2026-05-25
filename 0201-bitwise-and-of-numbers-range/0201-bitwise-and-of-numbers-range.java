class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int ans = 0;
        while (left !=0 && right !=0) {
            if(left == right)
            {
                ans = left;
                break;
            }
            else if(left > right)
            {
                left = left & (left-1);
            }
            else
            {
                right = right & (right - 1);
            }
        }
        return ans;
    }
}