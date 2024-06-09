import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] arr= constructArray(15);
        System.out.println("Before sorting: ");
        printArray(arr);

        System.out.println("After sorting: ");
        //InsertionSort.sort(arr);
        //SelectionSort.sort(arr);
        //Mergesort.sort(arr,0,arr.length-1);
        QuickSort.sort(arr,0,arr.length-1);
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] constructArray(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("Array size must be greater than 0");
        }

        int[] randomArray = new int[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            randomArray[i] = random.nextInt(1,10); // Generates a random int
        }

        return randomArray;
    }
}

