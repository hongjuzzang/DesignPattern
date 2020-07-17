package framework;

public abstract class ItemCreator {
	public Item create() {
		Item item;

		// template메소드처럼 여러 알고리즘을 나눠서 동작시킴
		requestItemsInfo();
		item = createItem();
		createItemLog();

		return item;
	}

	// 아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청
	abstract protected void requestItemsInfo();

	// 아이템 생성 후 데이터베이스에 로그 생성
	abstract protected void createItemLog();

	// 아이템을 생성하는 알고리즘
	abstract protected Item createItem();
}
