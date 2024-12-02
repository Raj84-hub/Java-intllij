import java.util.Scanner;
public class prg13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gender M/F");
        char s = sc.next().charAt(0);
        if (s == 'M' || s == 'm') {
            System.out.println("Good morning sir");
        } else if (s == 'F' || s == 'f') {
            System.out.println("Good morning ma'am");
        } else {
            System.out.println("invalid input");
        }

    }
}
