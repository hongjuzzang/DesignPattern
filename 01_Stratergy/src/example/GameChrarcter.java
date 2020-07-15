package example;

public class GameChrarcter {

	// 접근점
	Weapon weapon;

	// 교환 가능하게 하는 함수
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void attack() {
		// TODO Auto-generated method stub
		if (weapon == null) {
			System.out.println("맨손 공격");
		} else {

			// 델리게이트 : weapon의 attack을 실행함
			weapon.attack();
		}
	}
}
