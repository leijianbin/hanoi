package config;

import hanoi.HanoiPeg;
import hanoi.HanoiRing;
import hanoi.IllegalHanoiMoveException;

public class Pegs implements HanoiPeg {

	LinkedStack<HanoiRing> pegs = new LinkedStack<HanoiRing>();
	
	@Override
	public void addRing(HanoiRing ring) {
	
		if(ring == null) {
			throw new NullPointerException();
		}
		if(pegs.isEmpty()) {
			pegs.push(ring);
		}
		else if (ring.getSize() >= pegs.top().getSize()) {
			throw new IllegalHanoiMoveException();
		}
		else {
			pegs.push(ring);
		}
	}
	
	@Override
	public HanoiRing remove() {
		if(pegs.isEmpty()) {
			throw new IllegalHanoiMoveException();
		}
		return pegs.pop();
	}
	
	@Override
	public HanoiRing getTopRing() {
		return pegs.top();
	}
	
	@Override
	public boolean hasRings() {
		return (pegs.size() != 0);
	}
	
}
