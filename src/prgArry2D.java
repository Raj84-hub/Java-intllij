import java.util.Scanner;
public class prgArry2D {
    public static void main(String[] args) {
        int arr [][] = new int [3][4];
//        int arr [][] = new int [3][];
//        int arr[0] = new int [4];
//        int arr[1] = new int [5];
//        int arr[2] = new int [7];     Zacked Array 
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
