package multipletypeparameter;

public class MultipleTypeParameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TwoTypePair<String, Integer> pair = new TwoTypePair<>("Hello", 8);
        System.out.println(pair.toString());
    }

}
