package appointment.bean;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class Appointment {
	
	private  BigInteger appointmentId;
	private  static LocalDateTime datetime;
	private String appointmentStatus;
	
	public static BigInteger getAppointmentId() {
		/*
		 * BigInteger count = null, big1=new count=count.add(val);
		 */
		 BigInteger c=new BigInteger("1");
		 BigInteger appointmentId=new BigInteger("1");
		return appointmentId.add(c);
	}
	public void setAppointmentId(BigInteger appointmentId) {
		this.appointmentId = appointmentId;
	}
	public static  LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	public String getAppointmentStatus() {
		return appointmentStatus;
	}
	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}
	
	public Appointment(BigInteger appointmentId, LocalDateTime datetime) {
		super();
		this.appointmentId = appointmentId;
		this.datetime = datetime;
	}
	public Appointment() {
		super();
	}
	
	

}
