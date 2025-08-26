class Solution {
    public boolean isSubsequence(String s, String t) {
         if(check(s,  t,  s.length(),  t.length()))
         {
            return true;
         }
         else
         {
            return false;
         }
    }
    public static boolean check (String s1, String s2 , int n ,int m)
    {
        if(n==0)
        {
            return true;
        }
        if(m==0)
        {
            return false;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1))
        {
            return check(s1,s2,n-1,m-1);
        }
        return check(s1,s2,n,m-1);
    }
}