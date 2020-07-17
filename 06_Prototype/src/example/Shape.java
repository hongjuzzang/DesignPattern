package example;

// java는 이미 interface가 정의되어 있음
public class Shape implements Cloneable {
	
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
