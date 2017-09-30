package mergesort;

/**
 *
 * @author mfrazier1
 */
public class MergeSort {

    /**
     *
     * @param arr unsorted array
     * @return merged array
     */
    public static int[] MergeSort(int[] arr) {

        //  base case - only one element in array
        int length = arr.length;
        if (length <= 1) {
            return arr;
        }
        int[] arr1 = new int[length / 2];
        int[] arr2 = new int[length - length / 2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i + length / 2];
        }
        return merge(MergeSort(arr1), MergeSort(arr2));
    }

    /**
     *
     * @param arr1 sorted array
     * @param arr2 sorted array
     * @return merged arr1 & arr2 in sorted order
     */
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0, j = 0, k = 0; k < result.length; k++) {
            if (i >= arr1.length) {
                result[k] = arr2[j++];
            } else if (j >= arr2.length) {
                result[k] = arr1[i++];
            } else if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i++];
            } else {
                result[k] = arr2[j++];
            }
        }
        return result;
    }

}
