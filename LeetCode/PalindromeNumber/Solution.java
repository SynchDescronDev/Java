package LeetCode.PalindromeNumber;

public class Solution {
    
    public boolean isPalindrome(int x) {
        String val = Integer.toString(x);
        StringBuilder sb = new StringBuilder(val);
        return sb.reverse().toString().equals(val);

    }
}
