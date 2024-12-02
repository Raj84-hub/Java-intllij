import java .util.Scanner;
class prg12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int grtst = 0;
//        if (a > b && a > c) {
//            System.out.println("Greatest no is : ");
//            System.out.println(a);
//        } else if (b > c && b > a) {
//            System.out.println("Greatest no is : ");
//            System.out.println(b);
//        } else {
//            System.out.println("Greatest no is : ");
//            System.out.println(c);
//        }
        if (a > b && a > c) {
            grtst = a;
        } else if (b > c && b > a) {
            grtst = b;
        } else {
            grtst = c;
        }
        System.out.println("Gretest no is : "+grtst);
    }
}

