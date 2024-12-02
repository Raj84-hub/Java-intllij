//58- Take n integer inputs from user and store them in an array.
//Now, copy all the elements in an another array but in reverse order and print it.

import java.util.Arrays;
import java.util.Scanner;
public class prgAry58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int arr2[] = new int[n];
        int j = 0;
        for (int i = n-1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;
        }
        System.out.println("Reverse array is"+ Arrays.toString(arr2));
    }
}
