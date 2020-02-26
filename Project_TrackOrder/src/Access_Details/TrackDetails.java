package Access_Details;


import java.util.*;

import Constructors.TrackOrderDetailsCons;
import Repository.TrackOrderRepository;
public class TrackDetails {
	Map<Integer,TrackOrderDetailsCons>track;
	 //constructer
	 public TrackDetails()
	 {
		track=TrackOrderRepository.get();
	 }
	 //this function is used to get order ids and return ids in list form
	 public List<Integer> getId()
	 {
		List<Integer> list=new ArrayList<Integer>();
	    for(Map.Entry<Integer,TrackOrderDetailsCons>map:track.entrySet())
		{
			list.add(map.getKey()) ;
		}
		 return list;
	 }
	//this function gives the result by validating the id 
	public String getTrackOrderDetails(Integer id)
	 {
		String result="no data found";
		for(Map.Entry<Integer,TrackOrderDetailsCons> map:track.entrySet())
		{
			if(map.getKey().equals(id))
			{
				result= "\nOrder Id is->"+ map.getValue().getOrder_Id()+" \nSupplier Name is-> "+map.getValue().getSupplierName()+" \nLocation --> "+map.getValue().getPlace()+"\nexpected delivery--> "+map.getValue().getDate();
			}	 
		}
		 return result;	
	 }
}
