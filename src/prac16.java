
public class prac16 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int sum = 0, diff = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                diff = Math.abs(arr[i] - arr[j]);
                sum += diff;
            }
        }
        System.out.println(sum);
    }
}
