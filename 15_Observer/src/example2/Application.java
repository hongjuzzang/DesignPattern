package example2;

import java.util.Observable;
import java.util.Observer;

public class Application {

	public static void main(String[] args) {
		/* java 기본제공
		Observable observable;
		Observer observer;*/
		
		Button button = new Button();
		button.addObserver(new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				System.out.println(o+" is Clicked");
			}
		});
		
		button.onClick(); // 아무것도 안나와.. observable 클래스 특성상 changed가 트루일때만 동작함
		button.onClick();
		button.onClick();
	}

}
