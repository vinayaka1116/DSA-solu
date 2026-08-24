class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        int xor1 = 0;
        int xor2 = 0;
        for(int i=1;i<=n;i++){
            xor1^=i;
        }
        for(int i:arr){
            xor2^=i;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        int num = 0;
        for(int key:hm.keySet()){
            int val = hm.get(key);
            if(val == 2) {
                num = key;
                break;
            }
        }
        res.add(num);
        res.add(xor1^xor2^num);
        return res;
    }
}