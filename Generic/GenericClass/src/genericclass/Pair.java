
package genericclass;

/**
 *
 * @author Walter Savitch
 */
public class Pair<T> {

    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return (" first: " + first.toString() + "\n" + "Second: " + second.toString());
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (getClass() != other.getClass()) {
            return false;
        } else {
            Pair<T> otherPair = (Pair<T>) other;
            return (first.equals(otherPair.first) && second.equals(otherPair.second));
        }
    }

}
