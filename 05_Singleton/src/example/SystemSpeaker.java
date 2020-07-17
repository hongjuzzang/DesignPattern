package example;

public class SystemSpeaker {
	static private SystemSpeaker instance;
	private int volume;

	private SystemSpeaker() {
		// TODO Auto-generated constructor stub
		volume = 5;
	}

	public static SystemSpeaker getInstance() {
		// 1회 생성을 위함
		if (instance == null) {
			instance = new SystemSpeaker();
		}
		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
