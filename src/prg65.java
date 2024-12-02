import java.util.Arrays;

public class prg65 {
    public static void main(String[] args) {
        int arr[] = {12, -11, 8, -4, -8, 56, -2};
        int n = arr.length;
        int temp[] = new int[n];
        int i = 0, j = n - 1;
        for (int k = 0; k < n; k++) {
            if (arr[k] > 0) {
                temp[j] = arr[k];
                j--;
            } else {
                temp[i] = arr[k];
                i++;
            }

        }
        System.out.println(Arrays.toString(temp));
    }
}

//        int i = 0;
//        int j = arr.length-1;
//        while(i<j) {
//            while(i < j && arr[i] < 0){
//                i++;
//            }
//            while(j >= 0 && arr[j] > 0){
//                j--;
//            }
//            if(i<j){
//                int temp = arr[i];
//                arr [i] = arr[j];
//                arr [j] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));;
//    }
//}
