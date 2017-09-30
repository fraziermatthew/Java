package bucketsort;

/**
 *
 * @author mfrazier1
 */
public class BucketSort {

    private static int max;
    private static int[] bucket;

    /**
     *
     * @param arr array
     * @return max integer value in array
     */
    public static int maxValue(int[] arr) {
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     *
     * @param arr unsorted array
     * @param maxVal maximum value of array
     */
    public static void bucketSort(int[] arr, int maxVal) {
        bucket = new int[maxVal + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]]++;
        }

        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                arr[outPos++] = i;
            }
        }
    }

}
