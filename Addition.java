package computePackage;

public class Addition implements Computation {
	
	@Override
	public String myOperation() {
		return "dodawania";
	}
	
	@Override
	public double compute(double argument1, double argument2) {
		return argument1 + argument2;
	}
}
