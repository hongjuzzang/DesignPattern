package example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adapter adapter = new AdapterImpl();
		
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(88f));
		System.out.println(adapter.halfOf(48f));
		System.out.println(adapter.halfOf(28f));
		System.out.println(adapter.halfOf(38f));
		System.out.println(adapter.halfOf(18f));
	}

}
