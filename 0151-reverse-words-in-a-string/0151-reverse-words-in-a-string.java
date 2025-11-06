class Solution {
    public String reverseWords(String s) {
        if(s.length()==0)
        {
            return "";
        }
        int n = s.length();
        char ch [] = reverse(s).toCharArray();
        String ans = "";
        for(int i=0;i<n;i++)
        {
            String word = "";
        
            while(i<n && ch[i]!=' ')
            {
                word += ch[i];
                i++;
            }
            if(word.length()>0)
            {
            ans += reverse(word)+' ';
            }
        }
        return ans.substring(0,ans.length()).trim();
    }

    public static String reverse(String str)
    {
        StringBuilder s = new StringBuilder(str);
        return s.reverse().toString();
    }
}