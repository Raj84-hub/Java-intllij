import java.util.Scanner;
class prgl41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        int a;
        int b;
        do {
            System.out.println("enter 1 to add");
            System.out.println("enter 2 to sub ");
            System.out.println("enter 3 to mul ");
            System.out.println("enter 4 to div ");
            System.out.println("enter 0 to exit ");
            ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("enter first num");
                a = sc.nextInt();
                System.out.println("enter second num");
                b = sc.nextInt();
                System.out.println("Sum is " + (a + b));
            } else if (ch == 2) {
                System.out.println("enter first num");
                a = sc.nextInt();
                System.out.println("enter second num");
                b = sc.nextInt();
                System.out.println("Sub is " + (a - b));
            } else if (ch == 3) {
                System.out.println("enter first num");
                a = sc.nextInt();
                System.out.println("enter second num");
                b = sc.nextInt();
                System.out.println("mul is " + (a * b));
            } else if (ch == 4) {
                System.out.println("enter first num");
                a = sc.nextInt();
                System.out.println("enter second num");
                b = sc.nextInt();
                System.out.println("div is " + (a / b));
            } else if (ch == 0) {
                break;
            } else {
                System.out.println("Wromg input");
            }
        }while(ch>=0);
    }
}
