package config;

public class WarmUp implements algorithms.BasicMath {

	@Override
	public boolean isEven(int val) {
		if (val < 0) { // check if the val is negative
			val = -1 * val;
		}
		if (val == 0){ // recursive base case
			return true;
		}
		else if (val == 1){ // recursive base case 
			return false;
		}
		else{
			return isEven(val-2);
		}		
	}

	@Override
	public boolean isOdd(int val) {
		// TODO Auto-generated method stub
		return !isEven(val);
	}

	@Override
	public int sumN(int n) {
		// TODO Auto-generated method stub
		if ( n < 0)	{ // Exception of negative
			throw new IllegalArgumentException();
		}
		
		if (n == 0){
			return 0; //base case 
		}
		else {
			return n + sumN(n - 1);
		}
	}

	@Override
	public int factorial(int n) {
		// TODO Auto-generated method stub
		if (n < 0)	{ // Exception of negative
			throw new IllegalArgumentException();
		}
		
		if (n == 0 || n == 1){
			return 1; //base case
		}
		else{
			return n * factorial(n-1);
		}	
	}

	@Override
	public int biPower(int n) {
		// TODO Auto-generated method stub
		if (n < 0)	{
			throw new IllegalArgumentException();
		}
		
		if (n == 0) {
			return 1; //base case
		}
		else {
			return 2 * biPower(n-1);
		}
	}

}
