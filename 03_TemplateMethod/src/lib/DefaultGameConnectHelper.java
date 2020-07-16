package lib;

// 구현부는 library형태로 패키지 분리
// 그래서 Main.java에서 helper객체 선언 후 protected들은 뜨면 안됨
public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		// TODO Auto-generated method stub
		System.out.println("강화된 알고리즘을 이용한 디코드");
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
		//서버에서 유저이름 가지고 유저의 나이 확인 -> 10시 이후 접속 가능한지 판단
		//성인이 아니고 10시가 지났다면
		// 권한이 없는 것으로 한다
		
		return 0;
	}

	@Override
	protected String connection(String info) {
		// TODO Auto-generated method stub
		System.out.println("마지막 접속 단계!");
		return info;
	}

}
