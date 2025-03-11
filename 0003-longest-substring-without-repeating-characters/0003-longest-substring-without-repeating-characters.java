class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> characterSet = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            if (!characterSet.contains(s.charAt(right))) {
                characterSet.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                characterSet.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}