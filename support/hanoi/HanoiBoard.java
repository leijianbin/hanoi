package hanoi;

/**
 * A {@link HanoiBoard} is a representation of the Tower of Hanoi puzzle.
 * 
 * @author jcollard
 * 
 */
public interface HanoiBoard {

	/**
	 * Performs the specified {@link HanoiMove} on this {@link HanoiBoard}.
	 * 
	 * @param move
	 *            the move to perform.
	 * @throws IllegalHanoiMoveException
	 *             if {@code move} is not a legal move.
	 */
	public void doMove(HanoiMove move);

	/**
	 * Sets up this {@link HanoiBoard} such that there are {@code n}
	 * {@link HanoiRing}s on the starting {@link HanoiPeg}. The top most
	 * {@link HanoiRing} on the starting peg should be of size 1, and each
	 * {@link HanoiRing} beneath it should increase in size by 1. There should
	 * be no {@link HanoiRing}s on any of the other {@link HanoiPeg}s.
	 * 
	 * @param n
	 *            the number of {@link HanoiRing}s to start the game with.
	 * @throws IllegalArgumentException
	 *             if {@code n} is less than 0.
	 */
	public void setup(int n);

	/**
	 * Returns {@code true} if the puzzle has been solved and {@code false}
	 * otherwise.
	 * 
	 * @return {@code true} if the puzzle has been solved and {@code false}
	 *         otherwise.
	 */
	public boolean isSolved();

	/**
	 * Returns {@code true} if the specified move can be performed on this
	 * {@link HanoiBoard} and {@code false} otherwise.
	 * 
	 * @param move
	 *            the move to check
	 * @return {@code true} if the specified move can be performed on this
	 *         {@link HanoiBoard} and {@code false} otherwise.
	 * @throws NullPoinerException if {@code move} is {@code null}
	 */
	public boolean isLegalMove(HanoiMove move);

}
