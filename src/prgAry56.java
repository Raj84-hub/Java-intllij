//56- Find the second greatest element
//{2, 96, 69, 77, 145, 20} = Second greatest element = 96

public class prgAry56 {
    public static void main(String[] args) {
        int arr[] = {2, 96, 69, 77, 145, 20};
        int max = 0 , secondMax = 0 , thirdMax = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > max){
                thirdMax = secondMax;
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }else if(arr[i] > thirdMax && arr[i] < max && arr[i] < secondMax){
            thirdMax = arr[i];
        }
        }
        System.out.println("Second max element is "+thirdMax);
    }
}

