import java.util.Scanner;

class movie {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter movie rating");
    double rat = sc.nextDouble();
    String s = "";
    if(rat>0.0 && rat<=2.0){
        s = "Flop";
    }else if(rat>=2.1 && rat<=3.4){
        s = "semi hit";
    }else if(rat>=3.5 && rat<=4.5){
        s= "Hit";
    }else if(rat>=4.6 && rat<=5.0){
        s = "Super hit";
    }else{
        System.out.println("invalid movie rating.");
    }
        System.out.println("Movie is "+ s );

}

}
