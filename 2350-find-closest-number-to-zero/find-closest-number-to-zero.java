class Solution {
    public int findClosestNumber(int[] nums) {
        int i = Integer.MAX_VALUE;
        for (int num : nums) {
            if (Math.abs(num) < Math.abs(i) || num == Math.abs(i)) {
                i = num;
            }
        }
        return i;
    }
}