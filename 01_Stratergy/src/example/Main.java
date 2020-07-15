package example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameChrarcter hongju = new GameChrarcter();
		hongju.attack();
		
		hongju.setWeapon(new Knife());
		hongju.attack();

		hongju.setWeapon(new Sword());
		hongju.attack();
	}

}
