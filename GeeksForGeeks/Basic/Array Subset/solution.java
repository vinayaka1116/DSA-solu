class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count elements of a
        for (int x : a) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Check elements of b
        for (int x : b) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return false;
            }

            map.put(x, map.get(x) - 1);
        }

        return true;
    }
}