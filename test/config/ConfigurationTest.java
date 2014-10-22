package config;
import static org.junit.Assert.*;

import org.junit.Test;

import algorithms.BasicMathExample;
import config.Configuration;

public class ConfigurationTest {
	
	@Test(timeout = 5000)
	public void testStudentID() {
		assertNotNull("Your student ID number was null.",
				Configuration.STUDENT_ID_NUMBER);
	}

	@Test(timeout = 5000)
	public void testBasicMath() {
		assertNotNull(
				"You did not set which class to use for your BasicMath implementation.",
				Configuration.getBasicMathImplementation());
		assertNotEquals(
				"You did not change the default value of the BasicMath implementation.",
				BasicMathExample.class, Configuration.getBasicMathImplementation().getClass());
	}

	@Test(timeout = 5000)
	public void testList() {
		assertNotNull("You did not set which class to use for your "
				+ "List implementation.", Configuration.getListInterfaceImplemenation());
	}
	
	@Test(timeout = 5000)
	public void testBoard() {
		assertNotNull("You did not set which class to use for your "
				+ "HanoiBoard implementation.", Configuration.getHanoiBoardImplementation());
	}
	
	@Test(timeout = 5000)
	public void testPeg() {
		assertNotNull("You did not set which class to use for your "
				+ "HanoiPeg implementation.", Configuration.getHanoiPegImplementation());
	}
	
	@Test(timeout = 5000)
	public void testSolver() {
		assertNotNull("You did not set which class to use for your "
				+ "HanoiSolver implementation.", Configuration.getHanoiSolverImplementation());
	}

}
