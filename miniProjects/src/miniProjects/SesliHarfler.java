package miniProjects;

public class SesliHarfler {

	public static void main(String[] args) {
		char word = 'e';
		
		switch (word) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println("Kalın sesli harf.");
			break;
		default:
			System.out.println("İnce sesli harf.");
		}
	}

}
