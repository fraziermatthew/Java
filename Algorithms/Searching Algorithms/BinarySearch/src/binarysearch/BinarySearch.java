package binarysearch;

/**
 *
 * @author mfrazier1
 */
public class BinarySearch {

    public static void main(String[] args) {

        //  Sorted Array
        int array[] = {5, 10, 15, 20, 25,
            30, 35, 40, 45, 50,
            55, 60, 65, 70, 75,
            80, 85, 90, 95, 100};

        //  Divide & Conquer Approach
        System.out.println("Divide & Conquer Approach:");
        System.out.println(binarySearch(15, array));
        System.out.println(binarySearch(55, array));
        System.out.println(binarySearch(0, array));
        System.out.println(binarySearch(999, array));
        System.out.println(binarySearch(100, array));

        //  Recursive Approach
        System.out.println("Recursive Approach:");
        System.out.println(binarySearch(15, 0, array.length, array));
        System.out.println(binarySearch(55, 0, array.length, array));
        System.out.println(binarySearch(0, 0, array.length, array));
        System.out.println(binarySearch(999, 0, array.length, array));
        System.out.println(binarySearch(100, 0, array.length, array));
    }

    /**
     *
     * Big O(n/2) Time Complexity - Divide & Conquer Approach
     *
     * @param key value searched for
     * @param array a sorted array
     * @return index of key or -1 if key is not found
     */
    public static int binarySearch(int key, int[] array) {
        int low, mid, high;
        low = 0;
        high = array.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     *
     * Big O(n/2) Time Complexity - Recursive Approach
     *
     * @param key value searched for
     * @param low index of lower bound
     * @param high index of upper bound
     * @param array a sorted array
     * @return index of key or -1 if key is not found
     */
    public static int binarySearch(int key, int low, int high, int[] array) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            if (key < array[mid]) {
                return binarySearch(key, low, mid, array);
            } else if (key > array[mid]) {
                return binarySearch(key, mid + 1, high, array);
            } else {
                return mid;
            }
        }
        return -1;
    }

}
