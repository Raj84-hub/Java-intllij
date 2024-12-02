// Factorial using methos

public class prgM67 {
    public static int fact(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact ;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(prgM67.fact(n));
    }
}
