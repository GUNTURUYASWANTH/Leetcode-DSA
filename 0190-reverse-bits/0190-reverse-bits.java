class Solution {
    public int reverseBits(int n) {
        String s = (String.format("%32s",Integer.toBinaryString(n)).replace(' ','0'));
        s = reverse(s);
        return Integer.parseInt(s,2);
    }

    public static String reverse(String s)
    {
        StringBuilder st = new StringBuilder(s);
        return st.reverse().toString();
    }
}