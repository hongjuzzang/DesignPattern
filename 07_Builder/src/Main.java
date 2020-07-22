
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComputerFactory factory = new ComputerFactory(); // director의 역할
		factory.setBlueprint(new LgGramBluePrint()); // builder
		
		factory.make(); // 설계도대로 제작함
		Computer computer = factory.getComputer();
		
//		// 간단히 했지만 실제로 여러 인자가 필요할 수 도 있고,
//		// 각 인자마다 여러 옵션값이 별도로 들어갈 수도 있음
//		Computer computer = new Computer("17","16g","257g ssd");
		System.out.println(computer);
	}

}
