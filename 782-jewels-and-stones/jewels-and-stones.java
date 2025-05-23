class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsSet = new HashSet<>();
        for (char c: jewels.toCharArray()) {
            jewelsSet.add(c);
        }

        int total = 0;
        for (char c : stones.toCharArray()) {
            if (jewelsSet.contains(c)) {
                total++;
            }
        }
        return total;
    }
}