//69- Leetcode 1929 - Concatenation of array

import java.util.Arrays;

//public class prg70Ltcd {
//    public static int[] concatenationArray(int[] arr){
//        int n = arr.length;
//        int ans[] = new int[2*n];
//        for (int i = 0; i < n; i++) {
//            ans[i] = arr[i];
//            ans[i+n] = arr[i];
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {2,3,5,6,7};
//        concatenationArray(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}

public class prg70Ltcd {
    public static int[] concatenationArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];
        for (int i = 0; i <= result.length-1; i++) {
            result[i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            result[n + i] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,5,6,8};

        concatenationArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}

