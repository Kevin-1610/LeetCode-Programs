class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charIndex = new int[256];
        int maxLength = 0;
        int start = 0;

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            start = Math.max(start, charIndex[currentChar]);
            maxLength = Math.max(maxLength, i - start + 1);
            charIndex[currentChar] = i + 1;
        }
        return maxLength;
    }
}
