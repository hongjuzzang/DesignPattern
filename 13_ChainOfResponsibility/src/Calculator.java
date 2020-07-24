
public abstract class Calculator {

	private Calculator preCalculator;

	public void setNextCalculator(Calculator nextCalculator) {
		preCalculator = nextCalculator;

	}

	public boolean process(Request request) {
		if (operator(request)) {
			// 처리가 가능하다면
			return true;
		} else {
			if (preCalculator != null)
				if (preCalculator.process(request))
					return true;
			return operator(request);
		}

	}

	// 동작 수행
	abstract protected boolean operator(Request request);
}
