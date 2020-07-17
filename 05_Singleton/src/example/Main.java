package example;

public class Main {
	public static void main(String[] args) {
		// 두 객체는 같은 주소를 쓰고있음 -> 같은 인스턴스
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();

		// 5, 5
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());

		speaker1.setVolume(11);

		// 11, 11
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());

		speaker1.setVolume(22);
		// 22,22
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
	}
}
