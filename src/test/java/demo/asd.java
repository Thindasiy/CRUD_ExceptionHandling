package demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

public class asd {

	@Test
	public void test() {
		Date d = new Date();
		SimpleDateFormat timeGMT = new SimpleDateFormat("EEE dd/MM/yyyy HH:mm:ss z");
		timeGMT.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
		String timeStampLocal = timeGMT.format(d);
		System.out.println(timeStampLocal);
	}

}
