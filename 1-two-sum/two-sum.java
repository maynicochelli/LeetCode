class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(currentNum, i);
        }
        return new int[]{};
    }
}