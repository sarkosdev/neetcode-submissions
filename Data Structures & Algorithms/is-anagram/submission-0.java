class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        var sList = new ArrayList<Character>();
        var tList = new ArrayList<Character>();

        for(int i = 0; i < s.length(); i++) {
            sList.add((Character) s.charAt(i));
            tList.add((Character) t.charAt(i));
        }

        Collections.sort(sList);
        Collections.sort(tList);

        for(int i = 0; i < sList.size(); i++) {
            if(sList.get(i) != tList.get(i)) return false;
        }

        return true;

    }
}
