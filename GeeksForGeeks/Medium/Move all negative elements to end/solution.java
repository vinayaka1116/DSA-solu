class Solution {
    public void segregateElements(int[] arr) {
        // code here
       int[] temp = new int[arr.length];
       int k =0;
       for(int i=0;i<arr.length;i++){
           if(arr[i] >= 0){
               temp[k++] = arr[i];
           }
       }
       for(int i=0;i<arr.length;i++){
           if(arr[i]<0){
               temp[k++] = arr[i];
           }
       }
       for(int i=0;i<arr.length;i++){
           arr[i] = temp[i];
       }
    }
}

