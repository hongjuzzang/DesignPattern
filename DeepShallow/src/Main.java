
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		// -----------------------------
		// 얕은 복사
		// -----------------------------
		Cat kiki = new Cat();
		kiki.setName("Kiki");

		Cat momo = kiki; // 키키의 주소를 모모에게 줌
		momo.setName("Momo");

		// 얕은 복사기때문에 키키랑 모모랑 이름이 둘다 같이나옴
		System.out.println(kiki.getName());
		System.out.println(momo.getName());

		// -----------------------------
		// 깊은 복사
		// -----------------------------
		Cat nini = new Cat();
		nini.setName("Nini");
		nini.setAge(new Age(2018, 3));

		momo = nini.copy();
		momo.setName("Momo");
		momo.getAge().setYear(2013); // age에서는 깊은복사가 이루어지지않음 -> cat.copy에서 구현
		momo.getAge().setValue(2);

		System.out.println(nini.getName() + " " + nini.getAge().getYear());
		System.out.println(momo.getName() + " " + momo.getAge().getYear());
		
		
		System.out.println(nini.getName() + " " + nini.getAge().getValue());
		System.out.println(momo.getName() + " " + momo.getAge().getValue());

	}

}
