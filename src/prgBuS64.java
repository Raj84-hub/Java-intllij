// Bubble sort

import java.util.Arrays;

public class prgBuS64 {
    public static void main(String[] args) {
        int arr[] = {12,56,4,8,2,3,87};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
