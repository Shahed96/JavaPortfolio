
package selection.sort;

/**
 *
 * @author Shahed A. Abdulwahhb
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arr = {7, 6, 5, 4, 3, 2, 1, 0};
        selectionSort(arr);

    }

    public static void selectionSort(int[] arr) {
        int min;
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {

                if (arr[min] > arr[j]) {
                    min = j;
                }
                swap(i, min, arr);
            }

        }
        dispalyTheSortedArray(arr);

    }

    private static void swap(int i, int j, int[] a) {
        //swap function with temp variable:

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    private static void dispalyTheSortedArray(int[] arr) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("The sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

}
