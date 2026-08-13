class Solution {
    public static int findEquilibrium(int arr[]) {
        int total = 0, left = 0;

        for (int x : arr)
            total += x;

        for (int i = 0; i < arr.length; i++) {
            total -= arr[i];

            if (left == total)
                return i;

            left += arr[i];
        }

        return -1;
    }
}