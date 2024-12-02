import java.util.Scanner;
class prgl43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character :");
        char a = sc.next().charAt(0);
        switch (a){
            case 'a','e','i','o','u' : System.out.println("vovel");
            break;
            default : System.out.println("Consonent");
        }
    }
}
