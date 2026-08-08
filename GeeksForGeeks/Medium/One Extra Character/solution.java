class Solution {
    public char extraChar(String s1, String s2) {
        // code here
           int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i)]--;
        }

        for (char ch = 0; ch < freq.length; ch++) {
            if (freq[ch] != 0) {
                return ch;
            }
        }

        return '\0';
    }
}