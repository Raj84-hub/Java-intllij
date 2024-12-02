import java.util.Scanner;
class prgl39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sqr = num*num;
        int c =0;
        while(num!=0){
            num = num/10;
            c++;
        }
        int rem = (int)Math.pow(10,c);
        rem = sqr%rem;
        if (temp==rem){
            System.out.println("Automorphic");
        }else{
            System.out.println("non automorphic");
        }



}
}


