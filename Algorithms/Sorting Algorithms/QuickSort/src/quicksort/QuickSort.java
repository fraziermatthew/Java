package quicksort;

/**
 *
 * @author mfrazier1
 */
public class QuickSort {

    /**
     *
     * @param arr unsorted array
     * @param lowIndex lower bound
     * @param highIndex upper bound
     */
    public static void QuickSort(int[] arr, int lowIndex, int highIndex) {
        if (arr == null || arr.length == 0 || lowIndex >= highIndex) {
            return;
        }

        // pick the pivot
        int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
        int pivot = arr[middleIndex];
        // make left < pivot and right > pivot
        int i = lowIndex, j = highIndex;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (lowIndex < j) {
            QuickSort(arr, lowIndex, j);
        }

        if (highIndex > i) {
            QuickSort(arr, i, highIndex);
        }
    }

}
