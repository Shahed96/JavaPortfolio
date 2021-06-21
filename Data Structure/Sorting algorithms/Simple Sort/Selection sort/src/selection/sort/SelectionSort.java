package selection.sort;

/**
 *
 * @author Shahed A. Abdulwahhb
 */
public class SelectionSort  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Integer[] arr = {7, 6, 5, 4, 3, 2, 1, 0};
        selectionSort(arr);

    }
    //Generic method:

    public static <T extends Comparable> void selectionSort(T[] arr) { //extends expressin to use compareTo method
        int min;
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {

                if (arr[min].compareTo(arr[j]) > 0) {
                    min = j;
                }
                swap(i, min, arr);
            }

        }
        dispalyTheSortedArray(arr);

    }

    private static <T> void swap(int i, int j, T[] a) {
        //swap function with temp variable:

        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    private static <T> void dispalyTheSortedArray(T[] arr) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("The sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

}
