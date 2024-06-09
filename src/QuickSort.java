public class QuickSort {
    public static void sort(int [] arr, int left, int right) {
            if (left < right) {
                int partitionIndex =partition(arr,left,right); // partition method will find the position of piviot and palce it there. so that particular element is sorted
                sort(arr,left, partitionIndex-1);
                sort(arr, partitionIndex +1,right);
            }
    }

    private static int partition(int[] arr, int left, int right) {
        int piviot= arr[right];
        int key1= left; // index for bigger element
        int key2= left-1; // index for smaller element
        for (;key1<right;key1++){
            if (arr[key1] <= piviot) // checking if the element is bigger than the piviot
            {
                key2++;
                int temp= arr[key1];
                arr[key1]= arr[key2];
                arr[key2] = temp;
            }
        }

        arr[right]=arr[key2+1];
        arr[key2+1]=piviot;
        return key2+1;


    }



}
