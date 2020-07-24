package system;

public class Facade {
	private HelpSystem01 helpsystem01;
	private HelpSystem02 helpsystem02;
	private HelpSystem03 helpsystem03;

	public Facade() {

		helpsystem01 = new HelpSystem01();
		helpsystem02 = new HelpSystem02();
		helpsystem03 = new HelpSystem03();
	}

	public void process() {
		helpsystem01.process();
		helpsystem02.process();
		helpsystem03.process();
	}
}
