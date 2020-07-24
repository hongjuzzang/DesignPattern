
public class Main {

	public static void main(String[] args) {
		Calculator plus = new PlusCalculator();
		Calculator minus = new SubCalculator();

		plus.setNextCalculator(minus);

		Request request1 = new Request(1, 2, "+"); // 3
		Request request2 = new Request(10, 2, "-"); // 8
		
		plus.process(request1);
		plus.process(request2);
	}

}
