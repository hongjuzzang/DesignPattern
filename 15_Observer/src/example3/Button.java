package example3;

import example3.Observable.Observer;

public class Button {
	public Button() {
		// TODO Auto-generated constructor stub
		observable = new Observable<String>();
	}

	private Observable<String> observable;

	public void addObserver(Observer<String> o) {
		observable.addObserver(o);
	}

	public void notifyObservers() {
		observable.notifyObservers(null);
	}

	public void onClick() {
		observable.setChanged();
		notifyObservers();
	}

}
