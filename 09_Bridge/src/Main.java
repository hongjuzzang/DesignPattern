
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMorseCode code = new PrintMorseCode(new DefaultMorseCodeFunction());
		code.g().a().r().a().m();
		
		
		System.out.println();
		PrintMorseCode code1 = new PrintMorseCode(new SoundMorseCodeFunction());
		code1.g().a().r().a().m();
		
		
		System.out.println();
		PrintMorseCode code2 = new PrintMorseCode(new FlashMorseCodeFunction());
		code2.g().a().r().a().m();
	}

}
