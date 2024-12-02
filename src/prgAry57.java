//57- Check if array is sorted in increasing order or not.
//Ex 1 - { 1, 5, 8,  9, 10, 15 } - OP = "YES"
//Ex 2 - { 1, 8, 6, 9, 10, 15 } - OP = "NO"

public class prgAry57 {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 5, 10, 15 };
//        int arr[] = { 1, 8, 6, 9, 10, 15 };
        boolean x = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                x = false;
                break;
            }
        }
        System.out.println(x ? "sorted " : "not sorted");
//        if(x = true){
//            System.out.println("Array is sorted");
//        }else{
//            System.out.println("No array is not sorted");
//        }
    }
}
