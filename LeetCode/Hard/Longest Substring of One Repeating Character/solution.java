class Solution {
    int[] pre, suf, best, len;
    char[] left, right, s;

    void build(int node, int l, int r) {
        if (l == r) {
            left[node] = right[node] = s[l];
            pre[node] = suf[node] = best[node] = len[node] = 1;
            return;
        }

        int m = (l + r) / 2;

        build(node * 2, l, m);
        build(node * 2 + 1, m + 1, r);

        merge(node);
    }

    void merge(int node) {
        int a = node * 2;
        int b = node * 2 + 1;

        left[node] = left[a];
        right[node] = right[b];

        len[node] = len[a] + len[b];

        pre[node] = pre[a];
        suf[node] = suf[b];

        best[node] = Math.max(best[a], best[b]);

        if (right[a] == left[b]) {

            best[node] = Math.max(
                best[node],
                suf[a] + pre[b]
            );

            // Entire left part is same character
            if (pre[a] == len[a]) {
                pre[node] = len[a] + pre[b];
            }

            // Entire right part is same character
            if (suf[b] == len[b]) {
                suf[node] = suf[a] + len[b];
            }
        }
    }

    void update(int node, int l, int r, int idx) {
        if (l == r) {
            left[node] = right[node] = s[idx];
            pre[node] = suf[node] = best[node] = 1;
            return;
        }

        int m = (l + r) / 2;

        if (idx <= m)
            update(node * 2, l, m, idx);
        else
            update(node * 2 + 1, m + 1, r, idx);

        merge(node);
    }

    public int[] longestRepeating(
        String str,
        String queryCharacters,
        int[] queryIndices
    ) {
        s = str.toCharArray();

        int n = s.length;
        int size = 4 * n;

        pre = new int[size];
        suf = new int[size];
        best = new int[size];
        len = new int[size];

        left = new char[size];
        right = new char[size];

        build(1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        for (int i = 0; i < queryIndices.length; i++) {

            int idx = queryIndices[i];

            s[idx] = queryCharacters.charAt(i);

            update(1, 0, n - 1, idx);

            ans[i] = best[1];
        }

        return ans;
    }
}