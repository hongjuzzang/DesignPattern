package Concrete;

import abst.AbstAdding;
import abst.IBeverage;

// 실질적인 장식 인스턴스 및 정의이며, 책임이 추가되는 부분
public class Milk extends AbstAdding {

	public Milk(IBeverage base) {
		super(base);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + 50;
	}

}
