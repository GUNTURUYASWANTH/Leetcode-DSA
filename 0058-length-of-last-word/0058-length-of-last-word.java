class Solution {
    public int lengthOfLastWord(String s) {
        String [] str = s.split(" ");
        int count = str[str.length-1].length();
        return count;
    }
}