//63- Binary Search. If element found print the index else -1

public class prgABS63 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 8, 9, 15, 16};
        int key = 16;
        int index = -1;
        int Start = 0, end = arr.length - 1;
        while (Start <= end) {
            int midIndex = (Start + end) / 2;
            if (arr[midIndex] == key) {
                index = midIndex;
                break;
            }
            if (arr[midIndex] < key) {
                Start = midIndex + 1;
            } else {
                end = midIndex - 1;
            }
        }
        System.out.println("Element found at index "+index);
    }
}
