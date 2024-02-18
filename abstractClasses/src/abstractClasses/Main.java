package abstractClasses;

public class Main {

	public static void main(String[] args) {
		GameCalculator kidCalculator = new KidGameCalculator();
		
		kidCalculator.calculate();
		kidCalculator.gameOver();
		
	}

}
