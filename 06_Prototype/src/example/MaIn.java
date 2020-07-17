package example;

public class MaIn {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle(1,1,3);
		Circle circle2 = circle1.copy();
		
		
		System.out.println(circle1);
		System.out.println(circle2);
		
	}

}
