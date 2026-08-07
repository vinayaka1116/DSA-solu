class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<>();
        for ( int i : arr ) {
            if ( i < target ){ 
                list.add(i);
            }
        }
        return list;
    }
}