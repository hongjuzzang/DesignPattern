
public class SubCalculator extends Calculator {

	@Override
	protected boolean operator(Request request) {
		if (request.getOperator().equals("-")) {
			System.out.println(request.getA() + " - " + request.getB() + " = " + (request.getA() - request.getB()));
			return true;
		}
		return false;
	}

}
