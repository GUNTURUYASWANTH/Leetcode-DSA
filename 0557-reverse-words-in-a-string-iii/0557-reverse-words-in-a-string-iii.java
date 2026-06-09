class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int j = 0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==' ')
            {
                int x = i-1;
                while (j<x) {
                    char c = ch[x];
                    ch[x] = ch[j];
                    ch[j] = c;
                    j++;
                    x--;
                }
                j = i+1;
            }
        }

        // Corner case ki last word ni reverse cheyali
        int x = ch.length-1;
        int start = j;
        while (start < x) {
            char temp = ch[x];
            ch[x] = ch[start];
            ch[start] = temp;
            x--;
            start++;
        }
        return new String(ch);
    }

}