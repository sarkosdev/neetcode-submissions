class Solution {
    public boolean isPalindrome(String s) {
        
        if (s.length() <= 1) return true; 

        String nTemp = s.replaceAll("\\p{Punct}", "");
        String temp = nTemp.replaceAll(" ", "").toLowerCase();
        char [] a = temp.toCharArray();

        int l = 0;
        int r = a.length - 1;

        while(l < r) {
            if(a[l] != a[r]) return false;
            l++;
            r--;
        }

        return true;

    }
}
