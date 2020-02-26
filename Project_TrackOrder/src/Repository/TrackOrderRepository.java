package Repository;


import java.time.LocalDate;
import java.util.*;

import Constructors.TrackOrderDetailsCons;
public class TrackOrderRepository {
	
	private TrackOrderRepository()
	{	
	}
	static Map<Integer,TrackOrderDetailsCons>track=new HashMap<Integer,TrackOrderDetailsCons>();
	//All the data stored in HashMap
	static 
	 { 
		track.put(1,new TrackOrderDetailsCons(1,"Big Bazar","Kanpur",LocalDate.of(2020, 02, 16)));
		track.put(2,new TrackOrderDetailsCons(2,"Z square","Kanpur",LocalDate.of(2020, 05, 05)));
		track.put(3,new TrackOrderDetailsCons(3,"Mishra Traders","Lucknow",LocalDate.of(2020, 04,10)));
		track.put(4,new TrackOrderDetailsCons(4,"Puneet Suppliers","Kolkata",LocalDate.of(2020, 02, 07)));
		track.put(5,new TrackOrderDetailsCons(5,"Rahul Jwellers","Mumbai",LocalDate.of(2020, 06, 21)));
		track.put(6,new TrackOrderDetailsCons(6,"Vikas Bakery","Delhi",LocalDate.of(2020, 01, 07)));
		track.put(7,new TrackOrderDetailsCons(7,"Mohan Bakery","Kanpur",LocalDate.of(2020, 12, 03)));	 
	 }
	//Get Method to return the object of HashMap
	 static public  Map<Integer,TrackOrderDetailsCons> get()
	 { 
		 return track;	 
	 }
}
