
import java.util.Scanner;
class prgl44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess = (int) (Math.random()*10)+1;
        int cnt = 0;
        int maxAttempts = 8;
        System.out.println("Enter a number guess between 1-100");

        do{
            cnt++;
            --maxAttempts;
            if(maxAttempts==0){
                System.out.println("you exceed the max attempts.sorry you loss.");
            }
            int num = sc.nextInt();
            if(num==guess){
                System.out.println("Congrats you found the number.");
                break;
            }
            if(num>guess){
                System.out.println("Too high");
            }
            if(num<guess){
                System.out.println("To low");
            }
        }while (true);
        System.out.println("You found the number in "+cnt+" attempts.");

    }
}
