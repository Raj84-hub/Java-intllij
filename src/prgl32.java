// Check if the number is Prime or not.

import java.util.Scanner;
class prgl32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <=n ; i++) {
            if(n%1==0 && n%n==0){
                System.out.println(n+" is prime no.");
            }else{
                System.out.println(n+"is not a prime no.");
            }
        }

    }
}
