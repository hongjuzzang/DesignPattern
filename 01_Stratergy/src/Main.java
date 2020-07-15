
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 선언은 인터페이스 내부, 구현은 클래스 내부에서
		Ainterface ainterface= new AinterfaceImpl();
		//A 인터페이스를 사용할 수 있는 통로
		ainterface.funcA();
		
		AObj aobj = new AObj();
		aobj.funcAA();
	}

}
