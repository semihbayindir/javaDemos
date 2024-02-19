package courseExample.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void sendLog(String data) {
		System.out.println(data +" added. (Database Log))");
	}

}
