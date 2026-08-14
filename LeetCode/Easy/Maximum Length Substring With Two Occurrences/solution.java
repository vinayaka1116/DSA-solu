public class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        
        // Array for 26 lowercase English letters
        int[] counts = new int[26];
        
        for (int right = 0; right < s.length(); right++) {
            // Convert character to a 0-25 index
            int rightIdx = s.charAt(right) - 'a';
            counts[rightIdx]++;
            
            // Shrink the window if the count is too high
            while (counts[rightIdx] > 2) {
                int leftIdx = s.charAt(left) - 'a';
                counts[leftIdx]--;
                left++;
            }
            
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}
