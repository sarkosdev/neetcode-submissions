class Solution {
    public boolean isPalindrome(String s) {

        if(s.length() < 1) return true;

        String a = s.replace(" ", "");
        a = a.toLowerCase();
        int l = 0;
        int r = a.length() - 1;

        while(l < r) {
            if(!Character.isLetterOrDigit(a.charAt(l))) l++;
            if(!Character.isLetterOrDigit(a.charAt(r))) r--;
            else {
                if(a.charAt(l) != a.charAt(r)) return false;
                l++;
                r--;
            }

        }

        return true;
        
    }
}
