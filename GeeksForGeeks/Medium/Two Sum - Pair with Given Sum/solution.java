import java.util.*;

class Solution {
    static boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int needed = target - num;

            if (set.contains(needed)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}