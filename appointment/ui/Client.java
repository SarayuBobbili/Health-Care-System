package appointment.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import appointment.bean.Appointment;
import appointment.bean.DiagnosticCenter;
import appointment.bean.Test;
import appointment.bean.User;
import appointment.service.AppointmentService;
import appointment.util.CollectionUtil;
import java.util.*;
import java.util.Map.Entry;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		AppointmentService appointmentservice=new AppointmentService();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc=new java.util.Scanner(System.in);
	

		System.out.println("==============MENU====================");
        System.out.println("1. Book Appointment ");
        System.out.println("2. EXIT");
        System.out.println("Enter your choice\n");
		int s;
		s=sc.nextInt();
		try {
			
			switch (s) {
			case 1: 
				User u=CollectionUtil.user();
				DiagnosticCenter d=CollectionUtil.diagnosticcenter();
				
				HashMap t=CollectionUtil.test();
				Appointment a=new Appointment();
				AppointmentService appointmentservice1=new AppointmentService();
				appointmentservice1.makeAppointment(u,d, t, a.getDatetime());
				break;
			case 2: System.out.println("Logout");
			        break;

			default:
				break;
			}	
		} catch (Exception e) {
			System.out.println("Enter valid characters/numbers");
		}

	}

}
