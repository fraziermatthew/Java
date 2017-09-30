package quicksort;

/**
 *
 * @author mfrazier1
 */
public class Driver {

    public static void main(String[] args) {
        int[] test = {32, 5, 62, 85, 15, 20, 44};

        //  print unsorted array
        System.out.printf("%35s", "The unsorted array is: ");
        for (int i : test) {
            System.out.printf("%5d", i);
        }

        //  print sorted array increasing order
        QuickSort.QuickSort(test, 0, test.length - 1);
        System.out.printf("\n%35s", "The array in increasing order is: ");
        for (int i : test) {
            System.out.printf("%5d", i);
        }

        System.out.println();
    }

}
