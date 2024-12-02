// Print the sum of all even & odd numbers in a range seperately.

import java.util.Scanner;
 public class prgl29 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for (int i = 0; i <= n; i++) {
             if (i % 2 == 0) {
                 System.out.println(i + "Even no.");
             }
         }
         System.out.println();
         for (int i = 0; i <= n; i++) {
             if (i % 2 != 0) {
                 System.out.println(i + "Odd no.");
             }
         }
     }
 }