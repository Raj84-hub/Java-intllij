import java.util.Scanner;
 class prg22 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter alphabet to check..");
         String word = sc.nextLine();
         if(word.equals("A") ||word.equals("a") || word.equals("E") ||word.equals("e") ||word.equals("i") ||word.equals("I") ||word.equals("O") ||word.equals("o") ||word.equals("U") ||word.equals("u") ){
             System.out.println(word+" is Vowel.");
         }else{
             System.out.println(word+" is consonent.");
         }


     }
}
