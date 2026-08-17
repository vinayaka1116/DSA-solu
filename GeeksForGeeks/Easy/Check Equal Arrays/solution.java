class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}