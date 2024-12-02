//62- Linear Search an array - If element found print the index else -1

public class prgALS62 {
    public static void main(String[] args) {
        int arr[] = {12,45,98,48,78};
        int key = 45;

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                index = i;
                break;
            }
        }
        System.out.println(index == -1 ? "not found ":"found at index "+index);
    }
}
