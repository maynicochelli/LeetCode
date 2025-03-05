class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsSet = new HashSet<>();
        for (char j : jewels.toCharArray()) {
            jewelsSet.add(j);
        }

        int total = 0;
        for (char s : stones.toCharArray()) {
            if (jewelsSet.contains(s)) {
                total++;
            }
        }
        return total;
    }
}