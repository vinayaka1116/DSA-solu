class testClass implements in1 {
    public void display(int k) {
        // Add your code here.
        int count = 0;
        for (int i = 2; i <= k; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    // Helper method to check prime
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();   // number of test cases
        testClass obj = new testClass();
        while (T-- > 0) {
            int n = sc.nextInt();
            obj.display(n);
        }
        sc.close();
    }
}