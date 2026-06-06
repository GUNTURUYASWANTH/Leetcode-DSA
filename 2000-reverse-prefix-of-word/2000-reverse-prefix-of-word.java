class Solution {
    public String reversePrefix(String word, char ch) {
        char[] c = word.toCharArray();
        int k = 0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==ch)
            {
                k = i;
                break;
            }
        }

        int left = 0;
        int right = left+k;
        while(left<right)
        {
            char temp =' ';
            temp = c[left];
            c[left++] = c[right];
            c[right--] = temp;
        }
        return new String(c);

    }

    
}