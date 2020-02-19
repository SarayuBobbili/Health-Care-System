package appointment.dao;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import appointment.bean.DiagnosticCenter;
import appointment.bean.Test;
import appointment.bean.User;

public class AppointmentDAO {
	
	
	public BigInteger makeAppointment(User user,DiagnosticCenter center,Test test,LocalDateTime datetime)
	{
		return null;
		
	}
	
	public boolean approveAppointment()
	{
		return false;
	}
	public String viewAppointmentDetails(BigInteger appointmentId,User user,DiagnosticCenter center,Test test,LocalDateTime datetime)
	{
		return null;
		
	}

}
