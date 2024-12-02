// 59- Array left Rotation by 1

import java.util.Arrays;

public class prgAry59 {
    public static void main(String[] args) {
        int arr[] = {12,5,48,49,56};
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
           arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
