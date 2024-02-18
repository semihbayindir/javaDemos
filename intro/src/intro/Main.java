package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//değişken isimlendirmeleri camelCase olarak yazılır.
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		int vade = 12;
		
		double dolarDun = 30.15;
		double dolarBugün = 30.15;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugün < dolarDun) { // true
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugün == dolarDun){
			okYonu = "equal.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		//array
		String[] krediler = {"Hızlı Kredi","Maaş","Mutlu Emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
