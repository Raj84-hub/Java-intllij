import java.util.Arrays;

public class prgAry60 {
    public static void main(String[] args) {
        int arr[] = {12,5,48,49,56};
        int k = 2;
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
