import java.util.Scanner;
public class prg16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String s = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("valid to vote.");
            System.out.println("Hello "+s+"," + " you are a valid voter.");
        }else if(age<18){
            int validAge = 18-age;
            System.out.println("Invalid to vote.");
            System.out.println("Hello "+s+"," + " you can't vote.");
            System.out.println("You can vote after "+validAge+" years.");
        }else{
            System.out.println("invalid age");
        }
    }
}
