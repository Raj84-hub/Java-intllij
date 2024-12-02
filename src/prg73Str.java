// 73- Check if the string is Pallindromic or not

import java.util.Scanner;
public class prg73Str {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                String rev = "";
                for (int i = s.length()-1; i >= 0 ; i--) {
                    rev += s.charAt(i);
                }
        System.out.println(rev.equals(s) ? "palindrome" : " not palindrom");
            }

        }
