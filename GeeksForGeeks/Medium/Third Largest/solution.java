class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        Collections.sort(arr);

        if (arr.size() < 3)
            return -1;

        return arr.get(arr.size() - 3); 
    }
}