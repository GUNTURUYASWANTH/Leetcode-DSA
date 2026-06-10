class Solution {
    public String firstPalindrome(String[] words) {
        String str = new String();
        for(String s: words)
        {
            if(palindrom(s))
            {
                str = s;
                break;
            }
        }
        return str;
    }
    public static boolean  palindrom(String s)
    {
        char[] ch = s.toCharArray();
        int i= 0;
        int j = ch.length-1;
        boolean b = true;
        while(i<j)
        {
            if(ch[i]!=ch[j])
            {
                b = false;
            }
            i++;
            j--;
        }
        return b;
    } 
}