// 67- Strong number using methods

public class prgM68 {
    public static void strongNum(int n){
        int temp = n;
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            int fact = 1;
            for (int i = 1; i <= rem ; i++) {
                fact = fact * i;
            }
             sum = sum + fact;
             n = n/10;
        }
        System.out.println(sum == temp ? "Strong" : "Weak");

    }
    public static void main(String args[]){
        int n = 145;
        prgM68.strongNum(n);
    }
}
