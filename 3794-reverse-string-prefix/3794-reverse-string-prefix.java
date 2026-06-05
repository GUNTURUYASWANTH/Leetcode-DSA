class Solution {
    public String reversePrefix(String s, int k) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = left+k-1;

        while(left<right)
        {
            char temp = ' ';
            temp = ch[left];
            ch[left++] = ch[right];
            ch[right--] = temp;

        }
        return (new String(ch));
    }
}