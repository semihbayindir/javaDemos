package courseExample.core.logging;

public class FileLogger implements Logger{

	@Override
	public void sendLog(String data) {
		System.out.println(data + " added. (File log)");
		
	}

}
