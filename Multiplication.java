package computePackage;

public class Multiplication implements Computation {
	
	@Override
	public String myOperation() {
		return "mnozenia";
	}
	
	@Override
	public double compute(double argument1, double argument2) {
		return argument1 * argument2;
	}
}
