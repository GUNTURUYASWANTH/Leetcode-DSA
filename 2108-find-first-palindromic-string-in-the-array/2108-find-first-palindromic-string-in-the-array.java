class Solution {
    public String firstPalindrome(String[] words) {
        String str = new String();
        for(String s: words)
        {
            if(palindrom(s))
            {
                return s;
            }
        }
        return "";
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
                return false;
            }
            i++;
            j--;
        }
        return b;
    } 
}