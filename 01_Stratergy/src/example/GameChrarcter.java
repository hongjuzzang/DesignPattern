package example;

public class GameChrarcter {

	// ������
	Weapon weapon;

	// ��ȯ �����ϰ� �ϴ� �Լ�
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void attack() {
		// TODO Auto-generated method stub
		if (weapon == null) {
			System.out.println("�Ǽ� ����");
		} else {

			// ��������Ʈ : weapon�� attack�� ������
			weapon.attack();
		}
	}
}
