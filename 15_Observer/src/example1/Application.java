package example1;

import example1.Button.OnClickListener;

public class Application {

	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnClickListner(new OnClickListener() {

			@Override
			public void onClick(Button button) {
				System.out.println(button + " is Clicked");
			}
		});

		btn.onClick();
	}

}
