class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char c = s[left];
            s[left++] = s[right]; // s = s[right]   left += 1
            s[right--] = c; // s = s[right]   right -= 1
        }
    }
}