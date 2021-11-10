package Project2Package;

public class CalculatorImplement implements CalculatorInterface {

	@Override
	public double addtion(double a, double b) {
		
		return a+b;
	}

	@Override
	public double subtraction(double a, double b) {
		
		return a - b;
	}

	@Override
	public double multiplication(double a, double b) {
		
		return a * b;
	}

	@Override
	public double division(double a, double b) {
	
		return a / b;
	}
	
}
