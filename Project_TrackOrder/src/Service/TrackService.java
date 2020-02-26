package Service;

import Access_Details.TrackDetails;

import java.util.*;
public class TrackService
{
	TrackDetails obj=new TrackDetails();
	public List<Integer> getId()
	 {
	     return  obj.getId();
	 }
	//To get the details of particular Id
	public String getTrackOrderDetailsService(Integer id)
	 {
		 String result ="This is not a Valid ID Please try again..";
		 for(Integer i:obj.getId())
		 {
			 if(i.equals(id))
			 {
				result= obj.getTrackOrderDetails(id); 	 
			 }
		 }
		 return result; 
	 }
}
