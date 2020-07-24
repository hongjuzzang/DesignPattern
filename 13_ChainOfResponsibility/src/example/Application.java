package example;

public class Application {

	public static void main(String[] args) {
		Attack attack = new Attack(100);

		Armor armor1 = new Armor(10);
		Armor armor2 = new Armor(15);
		
		armor1.setNextDefense(armor2);
		
		armor1.defense(attack);
		
		System.out.println(attack.getAmount()); // 75

//		point 2 : 동적으로도 책임을 추가할 수 있다
		Defense defense = new Defense() {

			@Override
			public void defense(Attack attack) {
				// TODO Auto-generated method stub
				int amount = attack.getAmount();
				attack.setAmount(amount-50);
				
			}
			
		};
		
		// 추가 착용
		armor2.setNextDefense(defense);
		attack.setAmount(100); // 새로운 공격
		armor1.defense(attack);
		
		System.out.println(attack.getAmount());
	}

}
