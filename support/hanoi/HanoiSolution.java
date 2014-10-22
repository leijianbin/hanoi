package hanoi;

import structures.ListInterface;

/**
 * A {@link HanoiSolution} represents a solution to the Tower of Hanoi puzzle.
 * @author jcollard
 *
 */
public interface HanoiSolution {
	
	/**
	 * Returns the number of rings that this solution solves for
	 * @return  the number of rings that this solution solves for
	 */
	public int getNumberOfRings();

	/**
	 * Returns a {@link ListInterface} of {@link HanoiMove}s that solves the
	 * Tower of Hanoi puzzle.
	 * @return a {@link ListInterface} of {@link HanoiMove}s that solves the
	 * Tower of Hanoi puzzle.
	 */
	public ListInterface<HanoiMove> getMoves();

}
