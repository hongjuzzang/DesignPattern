package example;

public class Armor implements Defense {

	private Defense nextDefense;
	private int def;

	public Armor(int def) {
		super();
		this.def = def;
	}

	@Override
	public void defense(Attack attack) {

		// point : 처리 여부를 확인하지 않고 무조건 다음 방어 실행
		process(attack);

		if (nextDefense != null) {
			nextDefense.defense(attack);
		}
	}

	private void process(Attack attack) {
		int amount = attack.getAmount();
		amount -= def;
		attack.setAmount(amount);

	}

	public void setNextDefense(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getDef() {
		return def;
	}
}
