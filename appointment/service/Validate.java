package appointment.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Validate {
	
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	String input; 
	LocalDateTime localTimeObj1 = LocalDateTime.parse(input, formatter);
	
	public static boolean validate(String input)
	{
		try {
			LocalDateTime.parse(input, formatter);
			return true;
		}
		catch(DateTimeParseException e)
		{
			return false;
		}
		
	}


}
