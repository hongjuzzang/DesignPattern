
public class AObj {
	Ainterface ainterface;

	public AObj() {
		// TODO Auto-generated constructor stub
		ainterface = new AinterfaceImpl();
	}
	public void funcAA() {

		ainterface.funcA();
		ainterface.funcA();

		// System.out.println("AAA");�� ��ü������
		//� ����� �����Ҷ� �ٸ� ��ü�� ����� ���� ����ϴ� �� -> �����Ѵ�
	}
}
