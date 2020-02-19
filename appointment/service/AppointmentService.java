package appointment.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import appointment.bean.Appointment;
import appointment.bean.DiagnosticCenter;
import appointment.bean.Test;
import appointment.bean.User;
import appointment.util.CollectionUtil;

public class AppointmentService {
	
	public String makeAppointment(User user,DiagnosticCenter center,HashMap test,LocalDateTime datetime)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
	    
		//System.out.println(CollectionUtil.tests());
		char c='a';
        for(DiagnosticCenter d:CollectionUtil.diagnosticcenter1())
        {
        System.out.println("enter "+(c++)+" to select"+" "+d.getCenterName());
        }
		
		System.out.println("==================================");
        System.out.println("1. Select Diagnostic Center");
        System.out.println("2. EXIT");
        System.out.println("Enter your choice\n");
      
		int s=sc.nextInt();
		try {
			
			switch (s) {
			case 1: 
				char c2='a';
			        for(Test t:CollectionUtil.test1())
			        {
			        System.out.println("enter "+(c2++)+" to select"+" "+t.getTestName() );
			        }
			        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				    System.out.println("==================================");
		            System.out.println("1. Select Test");
		            System.out.println("2. EXIT");
		            System.out.println("Enter your choice\n");
			     
			   char c3=sc.next().charAt(0);
			   if(c3>='a' && c3<='z')
		    	{
			      try 
			      {
			        System.out.println("==================================");
		            System.out.println("Enter Date and Time in yyyy-MM-dd HH:mm");
		            while(true)
		            {
		            	String input=br.readLine();
		            	boolean b=Validate.validate(input);
		            		if(b==true)
			            	{
			            		try
			            		{
			            			LocalDateTime datetime1= LocalDateTime.parse(input);
			            			Appointment a=new Appointment();
			            			a.setDatetime(datetime1);
//			 				        System.out.println("Appointment Id: "+ Appointment.getAppointmentId());
//			 				        System.out.println("Date and Time:"+Appointment.getDatetime());
//			 					    System.out.println("Appointment Booked Successfully");
//			            			break;
			            		 }
			            		 catch(Exception e)
			            		 {
			            			System.out.println("Enter in valid format");
			            		 }
			            	  }
			            	  else
			            	  {
			            		System.out.println("Invalid /nEnter again");
			            	  }
		            	}
		            
				      }
			       catch(Exception e)
			       {
			    	  System.out.println("valid chars");
			       }
		     	}
		
			    else
			    {
				   System.out.println("LOGOUT");
			    }
			   break;
				
		case 2: System.out.println("LOGOUT");
			        break;
			}
		}
			
		catch (Exception e) {
			System.out.println("Enter valid characters/numbers");
		}
		
		return null;
   }
	
	public boolean approveAppointment()
	{
		boolean b=true; 
		return b;
	}
	
	public String viewAppointmentDetails(BigInteger appointmentId,User user,DiagnosticCenter center,Test test,LocalDateTime datetime)
	{
		return null;
		
	}

}
