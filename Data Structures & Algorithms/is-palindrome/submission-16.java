class Solution {
    public boolean isPalindrome(String s) {
        
        if (s.length() <= 1) return true; 

        String nTemp = s.replaceAll("\\p{Punct}", "");
        String temp = nTemp.replaceAll(" ", "").toLowerCase();
        char [] a = temp.toCharArray();

        int l = 0;
        int r = a.length - 1;

        while(l < r) {
            if(!Character.isLetterOrDigit(a[l])) l++;
            else if(!Character.isLetterOrDigit(a[r])) r++;
            else if(Character.isLetterOrDigit(a[l]) && Character.isLetterOrDigit(a[r])){
                if(a[l] != a[r]) return false;
                l++;
                r--;
            }
        }

        return true;

    }
}
