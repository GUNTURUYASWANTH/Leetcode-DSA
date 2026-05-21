class Solution {
    public int reverseBits(int n) {
        String s = (String.format("%32s",Integer.toBinaryString(n)).replace(' ','0'));
        s = reverse(s);
        int result = 0;
        for(int i=0;i<s.length();i++)
        {
            result = result * 2 + (s.charAt(i)-'0');
        }
        return result;
    }

    public static String reverse(String s)
    {
        StringBuilder st = new StringBuilder(s);
        return st.reverse().toString();
    }
}