import java.util.Scanner;
class prg21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit consumtion");
        int unit = sc.nextInt();

        int num1 = 100*6;
        int num2 = 100*7;
        int num3 = 100*8;
        int num4 = 100*9;
        int num5 = 100*10;
        int remainUnit =0;
        if(unit<=100){
            System.out.println("Total bill is "+(6*unit));
        } else if (unit>100 && unit<=200) {
            remainUnit = unit-100;
            remainUnit = remainUnit*7;
            System.out.println("Total bill is "+(num1+remainUnit));
        } else if(unit>200 && unit<=300){
            remainUnit = unit-200;
            remainUnit = remainUnit*8;
            System.out.println("total bill is "+(num1+num2+remainUnit));
        } else if(unit>300 && unit<=400){
            remainUnit = unit-300;
            remainUnit = remainUnit*9;
            System.out.println("total bill is "+(num1+num2+num3+remainUnit));
        } else if(unit>400){
            remainUnit = unit-400;
            remainUnit = remainUnit*10;
            System.out.println("total bill is "+(num1+num2+num3+num4+remainUnit));
        }else{
            System.out.println("invalid input.");
        }

        }


    }

