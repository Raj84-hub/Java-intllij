// Factorial of a number

import java.util.Scanner;
public class prgl28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact = i*fact;
        }
        System.out.println("Factorial of "+n+" is "+fact);

    }
}
