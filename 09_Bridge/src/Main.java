
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMorseCode code = new PrintMorseCode();
		code.g();
		code.a();
		code.r();
		code.a();
		code.m();
		System.out.println("\nChaining -- ");
		code.g().a().r().a().m();
	}

}
