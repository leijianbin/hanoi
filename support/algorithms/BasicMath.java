package algorithms;

/**
 * {@link BasicMath} is an interface that provides various basic math functions.
 * 
 * @author jcollard
 * 
 */
public interface BasicMath {

	/**
	 * Returns {@code true} if {@code val} is even and {@code false} otherwise.
	 * 
	 * @param val
	 * @return {@code true} if {@code val} is even and {@code false} otherwise.
	 */
	public boolean isEven(int val);

	/**
	 * Returns {@code true} if {@code val} is odd and {@code false} otherwise.
	 * 
	 * @param val
	 * @return {@code true} if {@code val} is odd and {@code false} otherwise.
	 */
	public boolean isOdd(int val);

	/**
	 * Returns the sum of all values between 1 and n.
	 * 
	 * @param n
	 * @return the sum of all values between 0 and n.
	 * @throws IllegalArgumentException if n is less than 0. 
	 */
	public int sumN(int n);

	/**
	 * Returns the multiplication of all values between 1 and n.
	 * 
	 * @param n
	 * @return the multiplication of all values between 1 and n.
	 * @throws IllegalArgumentException if n is less than 0. 
	 */
	public int factorial(int n);

	/**
	 * Returns 2 to the nth power. (2^n)
	 * 
	 * @param n
	 * @return 2 to the nth power.
	 * @throws IllegalArgumentException if n is less than 0.
	 */
	public int biPower(int n);

}
