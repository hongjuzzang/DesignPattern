import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {

		ArrayList<Visitable> visitables = new ArrayList<>();
		visitables.add(new VisitableA(1));
		visitables.add(new VisitableA(2));
		visitables.add(new VisitableA(3));
		visitables.add(new VisitableA(4));
		visitables.add(new VisitableA(5));

		Visitor visitor = new VisitorA();

		int ageSum = 0;
		for (Visitable v : visitables) {
			v.accept(visitor);
//			ageSum += ((VisitableA) v).getAge(); 이 경우도 가능하지만 코드가 긴 경우 유지보수 측면에서 적당하지 않음
			// or visitableA를 수정할 수 없는경우
		}
		System.out.println(((VisitorA) visitor).getAgeSum());
//		System.out.println(ageSum);
	}

}
