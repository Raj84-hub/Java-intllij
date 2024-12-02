// Sum of digits of a number, 936 = 18

import java.util.Scanner;
public class prg35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int newNum =0;
        int sum =0;
        while(num!=0){
            newNum = num%10;
            sum += newNum;
            num = num/10;

 }
        System.out.println(sum);
    }
}
