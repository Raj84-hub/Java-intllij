    public class prac17 {
    public static void main(String[] args) {
        int arr[] = {4,2,6,2,3};
        char arr2[] = {'b','a','c','a','b'};
        int minA = Integer.MAX_VALUE , minB = Integer.MAX_VALUE , minC = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            switch(arr2[i]){
                case 'a' -> minA = Math.min(arr[i] , minA);
                case 'b' -> minB = Math.min(arr[i] , minB);
                case 'c' -> minC = Math.min(arr[i], minC);
            }
        }
//        System.out.println(minA+" "+minB+" "+minC);
        System.out.println(Math.min((minA+minB),minC));

    }
}
