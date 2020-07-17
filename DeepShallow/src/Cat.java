
public class Cat implements Cloneable {

	private String name;
	private Age age;

	public void setAge(Age age) {
		this.age = age;
	}

	public Age getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Cat copy() throws CloneNotSupportedException {
		Cat cat = (Cat) this.clone();
		cat.setAge(new Age(this.age.getYear(), this.age.getValue())); // 새 객체 생성
		return cat;
	}
}
