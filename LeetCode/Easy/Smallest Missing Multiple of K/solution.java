class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] present = new boolean[101];

        for (int num : nums) {
            present[num] = true;
        }

        for (int multiple = k; multiple <= 100; multiple += k) {
            if (!present[multiple]) {
                return multiple;
            }
        }

        return ((100 / k) + 1) * k;
    }
}