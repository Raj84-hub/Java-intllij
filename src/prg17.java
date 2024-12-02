import java.util.Scanner;
class prg17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number..");
        int dayNAme = sc.nextInt();
        if (dayNAme == 1) {
            System.out.println("Today is monday.");
        } else if (dayNAme == 2) {
            System.out.println("Today is Tuesday.");
        } else if (dayNAme == 3) {
            System.out.println("Today is Wednesday.");
        } else if (dayNAme == 4) {
            System.out.println("Today is Thursday.");
        } else if (dayNAme == 5) {
            System.out.println("Today is Friday.");
        } else if (dayNAme == 6) {
            System.out.println("Today is Saturday.");
        } else if (dayNAme == 7) {
            System.out.println("Today is Sunday.");
        } else {
            System.out.println("Invalid day name.");
        }
    }
}
