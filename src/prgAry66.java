//66- Print the count of subarrays whose sum is equal to the target.
//Ex - {1,2,3,7,5}, T = 12  O/P - 2 - [ {2,3,7}, {7,5} ] - Both the subarrays has sum 12

import java.sql.SQLOutput;

public class prgAry66 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};
//        int arr[] = {4,6,3,5,8,2};
        int target = 12;
        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] + arr[j] == target){
//                    count++;
//                }
//            }
//
//        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
//                for (int k = j+1; k < arr.length; k++) {

//                sum = sum + arr[j];
//                if (sum == target) {
//                    count++;
//                }
                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

// For printing subArrays

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                for (int k = i; k <= j ; k++) {
//                    System.out.println(arr[k]+" ")
//
//                }
//                       System.out.println();
//
//            }
//
//        }
//    }
//}
