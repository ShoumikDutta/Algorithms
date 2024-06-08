public class Mergesort {
    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid); // left side
            sort(arr, mid + 1, right); // right side; theses 2 lines will recursively break down the sub arrays into one element arr
            merg(arr,left,mid,right); //
        }
    }

    private static void merg(int[] arr, int left, int mid, int right) {
        int[] tempArr = new int[right-left+1]; // subarray
        int leftkey=left;
        int rightkey = mid + 1;
        int i = 0; //for controlling the bigger sub array.

        for (; leftkey<= mid && rightkey<=right;) {
            if (arr[leftkey] <= arr[rightkey]) {
                tempArr[i] = arr[leftkey];
                leftkey++;
                i++;
            } else {
                tempArr[i] = arr[rightkey];
                rightkey++;
                i++;
            }
        }
         // conditions if there are some elements left in leftArr or rightArr
            while (leftkey <= mid) {
                tempArr[i] = arr[leftkey];
                i++;
                leftkey++;
            }
            while (rightkey <= right) {
                tempArr[i] = arr[rightkey];
                i++;
                rightkey++;
            }



        //copying the array
        for(int k=0;k<tempArr.length;k++) arr[left + k] = tempArr[k];

    }


}
