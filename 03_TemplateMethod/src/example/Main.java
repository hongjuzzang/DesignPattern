package example;

import lib.AbstGameConnectHelper;
import lib.DefaultGameConnectHelper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("아이디 암호 등 접속 정보");
	}

}
