package config;

import hanoi.HanoiBoard;
import hanoi.HanoiMove;
import hanoi.HanoiRing;
import hanoi.IllegalHanoiMoveException;

public class Board implements HanoiBoard {
	
	LinkedStack<HanoiRing> ringA = new LinkedStack<HanoiRing>();
	LinkedStack<HanoiRing> ringB = new LinkedStack<HanoiRing>();
	LinkedStack<HanoiRing> ringC = new LinkedStack<HanoiRing>();
	LinkedStack<HanoiRing> tempRing = null;
	
	LinkedStack[] ringArrary = {ringA, ringB, ringC};
	
	public static final int MAXSIZEOFGAME = 100; // max size of the hanoi game;
	
	@Override
	public void doMove(HanoiMove move) {
		if(!this.isLegalMove(move)) {
			throw new IllegalHanoiMoveException();
		}
		int fromPeg = move.getFromPeg();
		int toPeg = move.getToPeg();
		HanoiRing temp = (HanoiRing) ringArrary[fromPeg].pop();
		ringArrary[toPeg].push(temp);
	}
	
	@Override
	public void setup(int n) {
		if(n < 0 || n > MAXSIZEOFGAME) {
			throw new IllegalArgumentException();
		}
		setupRingA(n);
		clearRingBandC();
	}
	
	public void setupRingA(int n) {
		while (n > 0) {
			HanoiRing temp = new HanoiRing(n);
			ringA.push(temp);
			n--;
		}
	}
	
	public void clearRingBandC() {
		while (!ringB.isEmpty())
		{
			ringB.pop();
		}
		while (!ringC.isEmpty())
		{
			ringC.pop();
		}
	}
	
	@Override
	public boolean isSolved() {
		return (ringA.isEmpty() && ringB.isEmpty());
	}
	
	@Override
	public boolean isLegalMove(HanoiMove move) {
		
		int fromPeg = move.getFromPeg();
		int toPeg = move.getToPeg();
		
		if(fromPeg == toPeg) //can't move to itself
			return false;
		
		int fromSize = 0;
		int toSize = MAXSIZEOFGAME; // Init the toSize with the Max size.
		
		// check the from Peg have element or not and get the from peg top size
		if(ringArrary[fromPeg].isEmpty())
			return false;
		else {
			tempRing = ringArrary[fromPeg];
			fromSize = tempRing.top().getSize();
		}
		
		// check the to Peg have element or not and get the to peg top size
		if(!ringArrary[toPeg].isEmpty()) {
			tempRing = ringArrary[toPeg];
			toSize = tempRing.top().getSize();
		}
		
		// check the fetch element is larger than the to pegs top size or not
		if(fromSize > toSize)
			return false;
		
		return true;
	}
	
	
}
