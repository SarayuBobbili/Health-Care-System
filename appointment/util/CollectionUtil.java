package appointment.util;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import appointment.bean.Appointment;
import appointment.bean.DiagnosticCenter;
import appointment.bean.Test;
import appointment.bean.User;

public class CollectionUtil {
	
	private static HashMap<Integer,Appointment> ap=new HashMap<Integer, Appointment>();
	static {
		ap.put(1, new Appointment(new Appointment().getAppointmentId(),LocalDateTime.of(2020,2,16,10,00,00)));

	}
	/*
	 * public static LocalDateTime dateandtime() { return Appointment.getDatetime();
	 * } public static BigInteger appointment() { return
	 * Appointment.getAppointmentId(); }
	 */
	
	private static HashMap<Integer,User>u=new HashMap<Integer, User>();
	static {
		u.put(1,new User("A101", "abc", "Female", BigInteger.valueOf(101), "abc@gmail.com"));
		u.put(2,new User("A102", "def", "Male", BigInteger.valueOf(102), "def@gmail.com"));
	}
	public static User user()
	{
		return u.get(1);
	}
	
	private static HashMap<DiagnosticCenter,Test>d1=new HashMap<DiagnosticCenter,Test>();
	static {
		d1.put(new DiagnosticCenter("C101","ABC"),new Test("T101", "boold group\n"));
		d1.put(new DiagnosticCenter("C101","ABC"),new Test("T102", "boold sugar\n"));
		d1.put(new DiagnosticCenter("C101","ABC"),new Test("T103", "boold pressure\n"));	
	}
	public static HashMap<DiagnosticCenter,Test> tests()
	{
		return d1;
	}
	
	private static HashMap<Integer,DiagnosticCenter>d=new HashMap<Integer, DiagnosticCenter>();
	static {
		d.put(1, new DiagnosticCenter("C101","ABC Center"));
		d.put(2, new DiagnosticCenter("C102", "DEF center"));
		d.put(3, new DiagnosticCenter("C103", "GHI Center"));
	}
	public static DiagnosticCenter diagnosticcenter()
	{
		return d.get(2);
	}
	
	private static List<DiagnosticCenter>centerList=new ArrayList<DiagnosticCenter>();
	static {
		centerList.add(new DiagnosticCenter("C101","ABC Center"));
		centerList.add( new DiagnosticCenter("C102", "DEF center"));
		centerList.add(new DiagnosticCenter("C103", "GHI Center"));
	}
	public static List<DiagnosticCenter> diagnosticcenter1()
	{
		return centerList;
	}
	
	private static List<Test>listofTests=new ArrayList<Test>();
	static {
		listofTests.add(new Test("T101","blood group"));
		listofTests.add(new Test("T102","blood sugar"));
		listofTests.add(new Test("T103","blood pressure"));
	}
	public static List<Test> test1()
	{
		return listofTests;
		
	}
	private static HashMap<Integer, Test>t=new HashMap<Integer, Test>();
	static {
		t.put(1, new Test("T101","blood group"));
		t.put(2, new Test("T102", "blood sugar"));
		t.put(3, new Test("T103", "blood pressure"));
	}
	public static HashMap test()
	{
		return t;
	}
}
