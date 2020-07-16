package lib;

// 구현부는 library형태로 패키지 분리
// 그래서 Main.java에서 helper객체 선언 후 protected들은 뜨면 안됨
public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		// TODO Auto-generated method stub
		System.out.println("디코드");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		// TODO Auto-generated method stub
		System.out.println("아이디/비밀번호 확인과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// TODO Auto-generated method stub
		System.out.println("권한 확인");
		return 0;
	}

	@Override
	protected String connection(String info) {
		// TODO Auto-generated method stub
		System.out.println("마지막 접속 단계!");
		return info;
	}

}
