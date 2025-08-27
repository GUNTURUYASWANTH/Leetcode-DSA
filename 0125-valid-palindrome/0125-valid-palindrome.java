class Solution {
    public boolean isPalindrome(String s) {
        String check = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse = new StringBuilder(check).reverse().toString();
        if(check.equals(reverse))
            return true;
        else
            return false;

    }
}