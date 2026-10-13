class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;
        int r = 0;
        int res = 1;
        int maxFreq = 0;

        while (r < s.length()) {
            
            if(map.containsKey(s.charAt(r))) {
                map.merge(s.charAt(r), 1, Integer::sum);
            }
            else {
                map.put(s.charAt(r), 1);
            }

            //Check most frequent char in the map
            for (Integer entry : map.values()) {
                if(entry > maxFreq) maxFreq = entry;
            }


            if((r - l + 1) - maxFreq <= k) {
                res = Math.max(res, r - l + 1);
            }
            else {
                int val = map.get(s.charAt(l));
                map.put(s.charAt(l), val - 1);
                l++;
            }
            r++;
            
        }

        return res;

    }
}
