import java.util.Scanner;
class prgl23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <=n; i++) {
            sum = sum+i;
        }
        System.out.println("Sum upto "+n+" is "+sum);
    }
}
