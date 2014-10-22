package config;

import hanoi.HanoiBoard;
import hanoi.HanoiPeg;
import hanoi.HanoiSolver;
import structures.ListInterface;
import algorithms.BasicMath;
import algorithms.BasicMathExample;

/**
 * This class acts as a configuration file which tells the testing framework
 * which implementation you want us to use when we grade your assignment.
 * 
 * @author jcollard
 * 
 */
public class Configuration {

	
	/**
	 * Your 8 digit University of Massachusetts Identification Number. This
	 * is the value on your UMass ID Card. We need this to associate your submission
	 * with your moodle account when we submit grades
	 */
	public static final String STUDENT_ID_NUMBER = "27454561";
	
	/**
	 * The class you want us to test your BasicMath implementation against
	 * <p>
	 * <b>NOTE</b>: BasicMathExample will fail all tests in the private version
	 * the tests be sure to change it to the class you want to use.
	 * </p>
	 */
	public static BasicMath getBasicMathImplementation(){
		return new BasicMathExample();
	}


	/**
	 * Your implemenation class of ListInterface You must provide a public
	 * constructor of 0 arguments.
	 */
	public static <T> ListInterface<T> getListInterfaceImplemenation(){
		return new LinkedList<T>();
	}

	/**
	 * Your implementation class for HanoiBoard. You must provide a public
	 * constructor of 0 arguments.
	 */
	public static HanoiBoard getHanoiBoardImplementation(){
		return new Board();
	}

	/**
	 * Your implementation class for HanoiPeg . You must provide a public
	 * constructor of 0 arguments.
	 */
	public static HanoiPeg getHanoiPegImplementation(){
		return new Pegs();
	}

	/**
	 * Your implementation class for HanoiSolver. You must provide a public
	 * constructor of 0 arguments.
	 */
	public static HanoiSolver getHanoiSolverImplementation(){
		return new Solver();
	}

}
