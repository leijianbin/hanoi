package hanoi;

/**
 * A {@link HanoiSolver} implementation represents a strategy for solving the
 * Tower of Hanoi puzzle (see chapter 3.3 and http://en.wikipedia.org/wiki/Tower_of_Hanoi).
 * @author jcollard
 *
 */
public interface HanoiSolver {

	/**
	 * Solves the Tower of Hanoi puzzle for {@code n} rings.
	 * @param n the number of rings
	 * @return a {@link HanoiSolution} representing the moves to be played
	 * @throws IllegalArgumentException if {@code n} is less than 0.
	 */
	public HanoiSolution solve(int n);
	
}
