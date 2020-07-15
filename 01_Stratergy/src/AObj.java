
public class AObj {
	Ainterface ainterface;

	public AObj() {
		// TODO Auto-generated constructor stub
		ainterface = new AinterfaceImpl();
	}
	public void funcAA() {

		ainterface.funcA();
		ainterface.funcA();

		// System.out.println("AAA");와 대체가능함
		//어떤 기능을 구현할때 다른 객체의 기능을 빌려 사용하는 것 -> 위임한다
	}
}
