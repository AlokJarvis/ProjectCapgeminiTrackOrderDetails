package Main;

import static java.lang.System.out;
import java.time.LocalDate;
import java.util.*;
import Exception.NoDataFoundException;

import Service.TrackService;

public class Main {
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);	
	 control: while(true)
	 {
		 out.println("enter \n 1:Track Order   \n 2:Exit");
		 int choice=sc.nextInt();
		 switch(choice)
		 {
		 case 1: 
	         TrackService obj=new TrackService();
             out.println("Welcome to Tracking order");
	         out.println("---------------");
	         // To get all the available IDs
	         out.println("Available Order IDs are- \n"+obj.getId());
	         out.println("Enter the ID from the given List...");
	         int id=sc.nextInt();
	         //To call the details of particular ID
	         out.println( obj.getTrackOrderDetailsService(id));
	         break;
	
	 
	 case 2: break control;
	 default:out.println("You Entered the wrong choice");
	 }
	 }
	 sc.close();
  }
}
