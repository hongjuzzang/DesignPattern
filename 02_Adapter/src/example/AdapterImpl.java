package example;

public class AdapterImpl implements Adapter {

	// 인터페이스를 이용해서 타입을 변경해서 사용하고 다시 원하는 타입으로 변경  
	@Override
	public Float twiceOf(Float f) {
		// TODO Auto-generated method stub
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		// TODO Auto-generated method stub
		System.out.println("절반 함수 호출");
		return (float) Math.half(f.doubleValue());
	}


}
