//71- Accept a string from user and print its each character on a new line

//import java.util.Scanner;
//public class prg71-72Str {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }
//    }
//
//}

//         72- Accept a string and print it in reverse order

import java.util.Scanner;
public class prg7172Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = s.length()-1; i >= 0 ; i--) {
            System.out.println(s.charAt(i));
        }
    }

}

