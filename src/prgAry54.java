//54- Accept size n from user and create a n size array then take n inputs into the and finally
//Print the sum & Avg of all elements.

import java.util.Scanner;
public class prgAry54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <n; i++) {
            sum =  sum + arr[i];
        }
        int avg = sum/n;
        System.out.println("Sum of array is : "+sum);
        System.out.println("Avarage of array is : "+(double)avg);
    }
}
