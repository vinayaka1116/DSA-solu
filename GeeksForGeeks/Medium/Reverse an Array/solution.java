class Solution {
public void reverseArray(int arr[]) {
    int j=arr.length-1;
    int i=0;
    while(i<j){
        int  temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
        i++;
        j--;
    }
}
}