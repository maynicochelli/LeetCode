class Solution(object):
    def lengthOfLongestSubstring(self, s):
        l = 0
        longest = 0
        hashSet = set()
        n = len(s)

        for r in range(n):
            while s[r] in hashSet:
                hashSet.remove(s[l])
                l += 1

            w = (r - l) + 1
            longest = max(longest, w)
            hashSet.add(s[r])
        
        return longest