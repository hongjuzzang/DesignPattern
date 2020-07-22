package example2;

public class Main {

	public static void main(String[] args) {
		// 컴퓨터 객체 인자가 100개라면 어떡해..?
		// 인자 순서가 바뀌는 경우 -> Computer computer = new Computer("256g ssd","i7","8g");

		Computer computer = ComputerBuilder
				.start()
				.setCpu("i7")
				.setRam("8g")
				.build();
		
		Computer computer1 = ComputerBuilder
				.startWithCpu("i5")
				.setStorage("256g ssd")
				.build();

		System.out.println(computer);
		System.out.println(computer1);
	}

}
