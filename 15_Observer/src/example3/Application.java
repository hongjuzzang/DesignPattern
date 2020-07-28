package example3;

import example3.Observable.Observer;

public class Application {

	public static void main(String[] args) {
		// 1. generic
		// 2. delegate
		// 내부에 옵저버 생성
		Button button = new Button();
		button.addObserver(new Observer<String>() {

			@Override
			public void update(Observable<String> o, String arg) {
				System.out.println(o + " is Clicked");
			}
		});
	button.onClick();
	}

}
