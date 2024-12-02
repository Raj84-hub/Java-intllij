import java.util.Scanner;
public class cndion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if(year % 4 == 0 ){
//            System.out.print(year);
//            System.out.print(" is a leap year");
//        } else {
//            System.out.print(year);
//            System.out.println(" Not a leap year");
//        double amt = sc.nextInt();
//        if(amt>0 && amt<5000){
//            System.out.println(amt*.9);
//        }else if (amt>5000 && amt<8000){
//            System.out.println(amt * .8);
//        }else if (amt>8000 && amt<10000);
//        System.out.println(amt*.7);
//    } else{
//        System.out.println(amt*.6);
//    }

        int amt = sc.nextInt();
        int n = 0;
        int m =0;
        if(amt<=100){
            System.out.print("total bil is : "+amt*6);
        }else if(amt>100 && amt<200){
            amt = amt-100;
            n= amt*7;
            System.out.print("total bil is : ");
            System.out.print((100*6)+n);
        } else if (amt>200 && amt<300){
            amt = amt-200;
            n= amt*8;
            System.out.print("total bil is : ");
            System.out.print((100*6+100*7)+n);
        }else if(amt >300 && amt<400){
            amt = amt-300;
            n= amt*9;
            System.out.print("total bil is : ");
            System.out.print((100*6+100*7+100*8)+n);
        }else if(amt>400 && amt<600){
            amt = amt-400;
            amt = amt*10;
            System.out.print("total bil is : ");
            System.out.print((100*6+100*7+100*8+100*9)+amt);
        }else{
            System.out.print("total bil is : ");
            System.out.print((100*6+100*7+100*8+100*9*100*10)+amt);
        }

    }

}
