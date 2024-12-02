//55- Find the greatest element.
//        {2, 96, 69, 77, 145, 20}

import java.util.Scanner;
public class prgAry55 {
    public static void main(String[] args) {
        int arr[] = {2, 96, 69, 77, 145, 20};
        int max = arr[0];
        int min = arr[0] ;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                max = arr[i];
            }
            if(arr[i]<min)    {
                min = arr[i];
            }
        }
        System.out.println("Max element is : "+ max);
        System.out.println("Min element is : "+ min);

    }
}
