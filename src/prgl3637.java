//36- Accept a number and print its reverse

import java.util.Scanner;
public class prgl3637 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        int rem = 0;
        while (num!=0){
            rem = num%10;
            rev = rev*10+rem;
            num /= 10;
        }
        System.out.println(rev);

//37- Accept a number and check if it is a pallindromic number (If number and its reverse are equal)
        if(rev==temp){
            System.out.println("Number is pallindromic.");
        }else{
            System.out.println("Not pallindromic");
        }
    }
}
