package concrete;

import abst1.Button;
import abst1.GuiFactory;
import abst1.TextArea;

public class FactoryInstance {

	public static GuiFactory getGuiFactory() {
		// window인지, linux인지
		switch (getCode(System.getProperty("os.name"))) {
		case 0:
			return new LinuxGuiFactory();
		case 1:
			return new WinGuiFactory();
		}
		return null;
	}

	private static int getCode(String property) {
		// TODO Auto-generated method stub
		if(property.equals("Windows 10")) {
			return 1;
		}
		return 0;
	}

}

class LinuxButton implements Button {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("리눅스 버튼 클릭");

	}

}

class LinuxGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new LinuxTextArea();
	}

}

class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "리눅스 텍스트:";
	}

}

class WinButton implements Button {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("윈도우 버튼 클릭");
	}

}

class WinGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new WinTextArea();
	}

}

class WinTextArea implements TextArea {

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "윈도우 텍스트 : ";
	}

}