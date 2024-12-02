// Accept a number and check if it is a strong number or not (Sum of factorial of each digit)

import java.util.*;
class prgl38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (num != 0){
            int rem = num%10;
            int fact = 1;
        for (int i = 1; i<= rem; i++) {
            fact = fact * i;
        }
        sum = sum + fact;
        num = num/10;
        }
        System.out.println(sum==temp?"Strong" : "Weak");
        }
    }

