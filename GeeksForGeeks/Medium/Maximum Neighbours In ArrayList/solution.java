class Solution {
    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {
        // code here
        for(int i = 0; i < arr.size()-1; i++) 
            arr.set(i, Math.max(arr.get(i), arr.get(i+1)));
        
        arr.remove(arr.size()-1);
        return arr;
    }
}