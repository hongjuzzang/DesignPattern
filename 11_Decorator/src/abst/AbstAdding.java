package abst;

// 컴포넌트와 장식을 동일시 해주는 역할
abstract public class AbstAdding implements IBeverage {
	private IBeverage base;

	public AbstAdding(IBeverage base) {
		super();
		this.base = base;
	}

	public int getTotalPrice() {
		return base.getTotalPrice();
	}

	protected IBeverage getBase() {
		return base;
	}
}
