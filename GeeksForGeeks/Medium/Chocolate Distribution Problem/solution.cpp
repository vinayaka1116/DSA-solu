//Back-end complete function Template for C++

int minDiff(vector<int> &arr, int k) {
    // code here
    std::sort(arr.begin(), arr.end());
    int min =INT_MAX;
    
    for(int i=0;i<=arr.size()-k;i++){
        int d = arr[k+i-1]-arr[i];
        if(d <min) min =d;
    }
    return min;
}