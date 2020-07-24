package system;

// package 내에서만 수행(default 접근제어자)
class HelpSystem01 {

	public HelpSystem01() {
		System.out.println("Call Constructor : " + getClass().getSimpleName());
	}

	public void process() {
		System.out.println("Call Process : " + getClass().getSimpleName());
	}
}
