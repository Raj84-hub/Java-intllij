public class prg76str {
    public static void main(String[] args) {
        String s = "sbBfG";
        String ans = "";
        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                ans += (char) (ch-32);
            } else {
                ans += (char) (ch+32);
            }
        }
        System.out.println(ans);
    }
}
