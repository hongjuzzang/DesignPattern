
public class LgGramBluePrint extends BluePrint {
	private Computer computer;

	public LgGramBluePrint() {
		// TODO Auto-generated constructor stub
		computer = new Computer("defalut", "default", "default");
	}

	@Override
	public void setCpu() {
		computer.setCpu("i7");
	}

	@Override
	public void setRam() {
		computer.setRam("8g");
	}

	@Override
	public void setStorage() {
		computer.setStorage("256g ssd");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
