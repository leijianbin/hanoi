package config;

import structures.ListInterface;
import hanoi.HanoiMove;
import hanoi.HanoiSolution;

public class Solution implements HanoiSolution {

	public ListInterface<HanoiMove> solutionMoves;
	public int numberOfRings;
	
	@Override
	public int getNumberOfRings(){
		return numberOfRings;
	}

	public ListInterface<HanoiMove> getMoves()
	{
		return solutionMoves;
	}
}