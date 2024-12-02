//61- Array Reverse Without Using Extra space

import java.util.Arrays;

public class prgA61 {
    public static void main(String[] args) {
        int arr[] = {12,15,89,75,78};
        int i = 0, j=arr.length-1;
        while(i<j){
            int t = arr[i];
            arr[i]= arr[j];
            arr[j]= t;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
