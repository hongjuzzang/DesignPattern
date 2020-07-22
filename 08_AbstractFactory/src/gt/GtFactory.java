package gt;

import abst.BikeFactory;
import abst.Body;
import abst.Wheel;

public class GtFactory implements BikeFactory {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new GtWheel();
	}

}
