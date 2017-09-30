package selectionsort;

/**
 *
 * @author mfrazier1
 */
public class SelectionSort {

    /**
     *
     * @param arr unsorted array
     */
    public static void SSDecr(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int first, temp;
        for (int i = arr.length - 1; i > 0; i--) {
            first = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[j] < arr[first]) {
                    first = j;
                }
            }   //  end inner for loop

            //  swap smallest found with element in position i
            temp = arr[first];
            arr[first] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     *
     * @param arr unsorted array
     */
    public static void SSIncr(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int temp, min;

        for (int i = 0; i < arr.length - 1; i++) {
            // Index of smallest remaining value
            min = i;

            for (int j = i + 1; j < arr.length; j++) {
                // Remember index of new minimum
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }   //  end inner for loop

            if (min != i) {
                //  swap current element with smallest remaining
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

}
