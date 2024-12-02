public class prac19 {
    public static void main(String[] args) {
        int arr[] = {1 ,3,1,3,5,6,7,5};
        int max = Integer.MIN_VALUE;
        for(int ch : arr)
            if(arr[ch] > max)
                max = arr[ch];

        int n = arr.length;
        int lsum = 0 ;
        int rsum = 0;

        for (int i = 0; i < n/2; i++) {
            lsum += arr[i];
        }
        for (int i = n/2; i < n; i++) {
            rsum += arr[i];
        }
        int diff = Math.abs(rsum - lsum);
        if(diff == 0){
            System.out.println("Array is balanced");
        } else{
            System.out.println("Add " + diff + " in array to balance the array");
        }
    }
}
