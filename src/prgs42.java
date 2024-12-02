//switch can be use when oprtr is == , 1 oprnd == var nd 1 oprd== cnstant

import java.sql.SQLOutput;
import java.util.Scanner;
class prgs42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1 : System.out.println("Today is Sunday");
            break;
            case 2 : System.out.println("Today is Monday");
            break;
            case 3 : System.out.println("Today is Tuesday");
            break;
            case 4 : System.out.println("Today is wednesday");
            break;
            case 5 : System.out.println("Today is Thursday");
            break;
            case 6 : System.out.println("Today is Friday");
            break;
            case 7 : System.out.println("Today is Saturday");
            break;
            default: System.out.println("Wrong input");

        }
    }
}
