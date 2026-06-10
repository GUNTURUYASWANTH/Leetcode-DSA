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
        int i= 0;
        int j = s.length()-1;
        boolean b = true;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                b = false;
            }
            i++;
            j--;
        }
        return b;
    } 
}