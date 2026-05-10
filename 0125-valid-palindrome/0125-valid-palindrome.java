class Solution {

    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while(start < end) {

            while(start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while(start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            char startchar = s.charAt(start);
            char endchar = s.charAt(end);

            if(Character.toLowerCase(startchar) != Character.toLowerCase(endchar)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}