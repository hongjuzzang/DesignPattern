import abst1.Button;
import abst1.GuiFactory;
import abst1.TextArea;
import concrete.FactoryInstance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiFactory fac = FactoryInstance.getGuiFactory();

		// 어떤 환경에서 작동하든 os관계없이 동일하게 동작해야함
//		GuiFactory fac = new LinuxGuiFactory(); (x)

		Button btn = fac.createButton();
		TextArea ta = fac.createTextArea();

		System.out.println(ta.getText());
		btn.click();

	}

}
