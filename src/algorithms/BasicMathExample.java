package algorithms;

public class BasicMathExample implements BasicMath {

	@Override
	public boolean isEven(int val) {
		return ((val % 2) + 2) % 2 == 0;
	}

	@Override
	public boolean isOdd(int val) {
		return ((val % 2) + 2) % 2 == 1;
	}

	@Override
	public int sumN(int n) {
		if (n < 0)
			throw new IllegalArgumentException("Input must be greater than 0.");
		int sum = 0;
		while (n > 0)
			sum += n--;
		return sum;
	}

	@Override
	public int factorial(int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		int fact = 1;
		while (n > 0)
			fact *= n--;
		return fact;
	}

	@Override
	public int biPower(int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		int power = 1;
		while (n-- > 0)
			power <<= 1; // TODO Figure out what this <<= thing is.
		return power;
	}

}
