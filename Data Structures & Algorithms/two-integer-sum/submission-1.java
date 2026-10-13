class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] r = new int [2];

        for(int i = 0; i < nums.length; i++) {
            int s = target - nums[i];
            if(map.get(s) != null){
                r[0] = map.get(s);
                r[1] = i;
                break;
            }  
            map.put(nums[i], i);
        }
        return r;

    }
}
