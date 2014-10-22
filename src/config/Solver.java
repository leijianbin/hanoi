package config;

import structures.ListInterface;
import hanoi.HanoiMove;
import hanoi.HanoiSolution;
import hanoi.HanoiSolver;

public class Solver implements HanoiSolver {

	Solution solution = new Solution(); //Init Solution
	ListInterface<HanoiMove> solutionMoves;
	
	public void SetupSolution(int n) {
		if(n < 0)
			throw new IllegalArgumentException();
		//Solution solution = new Solution();
		solutionMoves = Configuration.getListInterfaceImplemenation();
		solution.solutionMoves = solutionMoves;
		solution.numberOfRings = n;
	}
	
	@Override
	public HanoiSolution solve(int n) {
		SetupSolution(n);
		
		//solve the hanoi
		if(n != 0) {
			solutionMoves = hanoiRecursive(n, 0, 2, 1); 
		}
		
		solution.solutionMoves = solutionMoves; //set the solver result to solution
		return solution;
	}
	
	public ListInterface<HanoiMove> hanoiRecursive(int size, int fromPeg, int toPeg, int helperPeg) {
		HanoiMove move;
		if(size == 1) //base case
		{
			move = new HanoiMove(fromPeg, toPeg);
			solutionMoves.append(move);
		}
		else
		{
			hanoiRecursive(size-1, fromPeg, helperPeg, toPeg);
			move = new HanoiMove(fromPeg, toPeg);
			solutionMoves.append(move);
			hanoiRecursive(size-1, helperPeg, toPeg, fromPeg);
		}
		return solutionMoves;
	}
	
}