package com.CK;

public class Main {

    public static void main(String[] args) {
        String s = "0P";
        Solution solution = new Solution();
        System.out.println(Character.isAlphabetic('0'));
        System.out.println(solution.isPalindrome(s));
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) !=Character.toLowerCase(s.charAt(right))) return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}