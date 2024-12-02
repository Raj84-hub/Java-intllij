public class prg75str {
    public static void main(String[] args) {
        String str = "abhe bi onse";
        int v = 0 , c = 0 , spc = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                v++;
            } else if (ch == ' ') {
                spc++;
            }else{
                c++;
            }
        }
        System.out.println("Vovels are - "+v);
        System.out.println("Consonents are - "+c);
        System.out.println("Spaces are - "+spc);
    }
}
