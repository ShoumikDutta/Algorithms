public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // i is the right key
            for (int j = 0; j < i; j++) { // j is the left key
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
