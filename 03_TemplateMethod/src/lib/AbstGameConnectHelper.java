package lib;

public abstract class AbstGameConnectHelper {

	// 외부에서 접근은 안되는데 하위클래스에서는 접근 가능하게 해야하므로 protected 사용

	// 보안 단계
	protected abstract String doSecurity(String string);

	// 인증 단계
	protected abstract boolean authentication(String id, String password);

	// 권한 단계
	protected abstract int authorization(String userName);

	// 접속 단계
	protected abstract String connection(String info);

	// 템플릿 메소드
	public String requestConnection(String encodedInfo) {

		// 보안 작업 -> 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(encodedInfo);

		// 인증 단계 -> 반환된 것을 가지고 아이디, 암호를 할당한다.
		String id = "aaa";
		String password = "bbb";
		if (!authentication(id, password)) {
			throw new Error("아이디 비밀번호 불일치");
		}

		// 권한 단계 ->
		String userName = "";
		int i = authorization(userName);
		switch (i) {
		case -1:
			throw new Error("10시 이후 접속 불가한 유저야");
		case 0:
			System.out.println("게임 매니저");
			break;
		case 1:
			System.out.println("유료 회원");
			break;
		case 2:
			System.out.println("무료 회원");
			break;
		case 3:
			System.out.println("권한 없음");
			break;
		default:
			System.out.println("기타 상황");
			break;
		}

		return connection(decodedInfo);
	}
}
