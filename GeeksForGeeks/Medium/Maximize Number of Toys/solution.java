class Solution {
    public static int maxToys(int arr[], int k) {
        // Your code here
         int sum=0;
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum <= k ){
                count++;
            }
        }
        return count;
    }
}