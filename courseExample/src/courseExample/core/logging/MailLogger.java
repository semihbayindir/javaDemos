package courseExample.core.logging;

public class MailLogger implements Logger{

	@Override
	public void sendLog(String data) {
		System.out.println(data + " added. (Mail log)");		
	}

}
