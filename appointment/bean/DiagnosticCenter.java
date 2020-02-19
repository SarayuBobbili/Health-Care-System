package appointment.bean;

import java.util.ArrayList;
import java.util.List;

public class DiagnosticCenter {
	
	private String centerId;
	private String centerName;
	
	List<Test>listOfTests=new ArrayList<Test>();
	List<Appointment>appointmentList=new ArrayList<Appointment>();
	
	public DiagnosticCenter(String centerId, String centerName) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
	}

	public DiagnosticCenter(String centerId, String centerName, Test t) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.listOfTests.add(t);
	}

	@Override
	public String toString() {
		return "DiagnosticCenter [centerId=" + centerId + ", centerName=" + centerName + "]";
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	
		
}
