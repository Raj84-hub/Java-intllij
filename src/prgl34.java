//  Seprate each digit of a number and print it on the new line

import java.util.Scanner;
class prgl34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        for (int i = n; i <=0; i--) {
            rem = n%10;
            System.out.println(rem);
        }
    }
}
