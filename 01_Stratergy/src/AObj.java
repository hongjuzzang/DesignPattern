
public class AObj {
	Ainterface ainterface;

	public AObj() {
		// TODO Auto-generated constructor stub
		ainterface = new AinterfaceImpl();
	}
	public void funcAA() {

		ainterface.funcA();
		ainterface.funcA();

		// System.out.println("AAA"); 와 같은 기능을 함
	}
}
