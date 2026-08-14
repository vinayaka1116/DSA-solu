class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = arr[0];
        for(int i : arr)
            if(i>=max)
            max = i;
            return max;
        
    }
}
