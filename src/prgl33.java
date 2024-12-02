//Write a program to take two inputs a, b & find the value of a  raised to the power of b.

import java.util.Scanner;
class prgl33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int power = 1;
        for (int i =1; i <=b ; i++) {
             power = power*a;
        }
        System.out.println("power is "+power);
    }

}
