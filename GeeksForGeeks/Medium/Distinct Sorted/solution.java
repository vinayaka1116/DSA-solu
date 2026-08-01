class Solution {
    public ArrayList<Integer> uniqueSorted(int arr[]) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(arr);
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1])
            {
                continue;
            }else{
                 list.add(res);
                res=arr[i];
               
            }
        }
        list.add(res);
        return list;
    }
}