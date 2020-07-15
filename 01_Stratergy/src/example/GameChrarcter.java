package example;

public class GameChrarcter {

	// 접근점
	Weapon weapon;

	// 교환가능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void attack() {
		// TODO Auto-generated method stub
		if (weapon == null) {
			System.out.println("맨손 공격");
		} else {

			// 델리게이트 : 가진 무기에 따른 attack 실행
			weapon.attack();
		}
	}
}
