package linearsearch;

/**
 *
 * @author mfrazier1
 */
public class LinearSearch {

    public static void main(String[] args) {
        int array[] = {5, 10, 15, 20, 25,
            30, 35, 40, 45, 50,
            55, 60, 65, 70, 75,
            80, 85, 90, 95, 100};
        System.out.println(linearsearch(15, array));
        System.out.println(linearsearch(55, array));
        System.out.println(linearsearch(0, array));
        System.out.println(linearsearch(999, array));
        System.out.println(linearsearch(100, array));
    }

    /**
     *
     * Big O(n) Time Complexity
     *
     * @return index of key or -1 if key is not found
     */
    public static int linearsearch(int key, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }

}
