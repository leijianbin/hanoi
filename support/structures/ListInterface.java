package structures;

/**
 * A {@link ListInterface} is an unbounded container supporting appending to the
 * end and retrieval at a specified index.
 * 
 * @author jcollard
 * 
 * @param <T>
 *            the type of element being stored
 */
public interface ListInterface<T> {

	/**
	 * Returns the number of elements in this {@link ListInterface}. The running
	 * time of this method must be O(1).
	 * 
	 * @return the number of elements in this {@link ListInterface}
	 */
	public int size();

	/**
	 * Appends an element to the end of this {@link ListInterface}. For
	 * convenience, this method returns the appended {@link ListInterface}. The
	 * running time of this method must be O(1).
	 * 
	 * @param elem
	 *            the element to append
	 * @return the appended {@link ListInterface}.
	 * @throws {@code NullPointerException} if {@code elem} is {@code null}
	 */
	public ListInterface<T> append(T elem);

	/**
	 * Removes the {@code n}th element in this {@link ListInterface} and returns
	 * it. If {@code n} is not in the range [0, {@link ListInterface#size()}) an
	 * {@link IndexOutOfBoundsException} will be raised.
	 * 
	 * The running time of this method must be O(n) where n is the index being
	 * removed (not the size of the list). That is remove(0) should run in
	 * constant time.
	 * 
	 * @param n
	 *            the location of the element to retrieve
	 * @return the removed element.
	 * @throws IndexOutOfBoundsException
	 *             if n is not a valid location in the list
	 */
	public T remove(int n);

}
