package insertionsort;

/**
 *
 * @author Shahed A.
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] arr = {7, 8, 5, 4, 3, 2, 1, 0};
        inserionSort(arr);
    }

    public static <T extends Comparable> void inserionSort(T[] a) {
        int j, i;
        for (i = 1; i < a.length; i++) {
            //initial condition 
            j = i;
            while (j > 0 && (a[j].compareTo(a[j - 1]) < 0)) {

                swap(j, j - 1, a);
                j--;
            }

        }
        display(a);

    }

    private static <T> void swap(int i, int j, T[] a) {
        //swap function with temp variable:
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    private static <T> void display(T[] arr) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("The sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

}
