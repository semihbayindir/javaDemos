package polymorphismDemo;

public class CustomerManager {
	BaseLogger logger = new BaseLogger();
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("customer added.");
		this.logger.log("Log message");
	}
}
