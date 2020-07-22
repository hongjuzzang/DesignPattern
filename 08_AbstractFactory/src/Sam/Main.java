package Sam;

import abst.BikeFactory;
import abst.Body;
import abst.Wheel;
import gt.GtFactory;

public class Main {

	public static void main(String[] args) {
//		BikeFactory factory = new SamFactory();
		BikeFactory factory = new GtFactory();

		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();

		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}

}
