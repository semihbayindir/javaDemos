package miniProjects;

public class AsalSayi {

	public static void main(String[] args) {
		int number = 1;
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println("bu bir asal sayı değildir.");
			return;
		}
		
		if (number < 1) {
			System.out.println("Geçersiz sayı.");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
		}
		
		if (isPrime == true) {
			System.out.println("bu bir asal sayıdır.");
		} else {
			System.out.println("bu bir asal sayı değildir.");
		}
	}

}
	}
