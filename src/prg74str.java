// 74- Pallindromic String using method and
// T?wo pointer algorithm (hint: Array reverse algo)

public class prg74str {
    public static void main(String[] args) {
        String s = "abvckfg";
        char str[] = s.toCharArray();

        int i = 0 , j = str.length-1;
        while (i<j){
            char temp = str[i];
             str[i] = str[j];
             str[j] = temp;
             i++;
             j--;
        }
        String rev = "";
        for (char ch : str){
            rev += ch;
        }
        System.out.println(rev); 
    }
}
