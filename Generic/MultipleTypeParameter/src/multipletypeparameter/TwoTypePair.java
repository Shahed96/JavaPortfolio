
package multipletypeparameter;

/**
 *
 * @author Walter Savitch
 * @param <T1>
 * @param <T2>
 */
public class TwoTypePair<T1, T2> {
    private T1 first;
    private T2 second;
    
    public TwoTypePair(){
     first = null;
        second = null;
    }
    public TwoTypePair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }
    public void setFirst(T1 first) {
        this.first = first;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }
    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }
    @Override
    public String toString() {
        return (" first: " + first.toString() + "\n" + "Second: " + second.toString());
    }
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (getClass() != other.getClass()) {
            return false;
        } else {
            TwoTypePair<T1,T2> otherPair = (TwoTypePair<T1,T2>) other;
            return (first.equals(otherPair.first) && second.equals(otherPair.second));
        }
    }
}
