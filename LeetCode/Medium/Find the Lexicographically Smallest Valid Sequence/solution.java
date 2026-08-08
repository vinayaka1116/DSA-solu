class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length(), m = word2.length();

        int[] suf = new int[m];
        int p = n - 1;

        for (int i = m - 1; i >= 0; i--) {
            while (p >= 0 && word1.charAt(p) != word2.charAt(i))
                p--;

            suf[i] = p;
            p--;
        }

        int[] ans = new int[m];
        int pos = 0;
        boolean used = false;

        for (int i = 0; i < m; i++) {
            while (pos < n) {

                if (word1.charAt(pos) == word2.charAt(i)) {
                    ans[i] = pos++;
                    break;
                }

                // Use the one allowed change
                if (!used &&
                    (i == m - 1 ||
                     (suf[i + 1] != -1 && suf[i + 1] > pos))) {

                    ans[i] = pos++;
                    used = true;
                    break;
                }

                pos++;
            }

            if (pos == n && i < m - 1)
                return new int[0];
        }

        return ans;
    }
}