
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 인터페이스에서 선언, 객체에서 실행
		Ainterface ainterface= new AinterfaceImpl();
		// 통로
		ainterface.funcA();
		
		AObj aobj = new AObj();
		aobj.funcAA();
	}

}
