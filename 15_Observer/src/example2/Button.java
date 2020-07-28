package example2;

import java.util.Observable;

public class Button extends Observable {
	public void onClick() {
		setChanged(); // change 변경
		notifyObservers();
	}

}
