//17 . Given an array of integers, update every element with the multiplication of previous and next elements with the following exceptions.
// a) The First element is replaced by the multiplication of the first and second.
// b) The last element is replaced by multiplication of the last and second last.

import java.util.Arrays;

public class prg17Arr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arr[0] = arr[0] * arr[1];
        int pre = arr[0];
        for (int i = 1; i < arr.length-1 ; i++) {
            int curr = arr[i];
            arr[i] = pre * arr[i+1];
            pre = curr;
        }
        arr[arr.length-1] = pre * arr[arr.length-1];
        System.out.println(Arrays.toString(arr));
    }
}
