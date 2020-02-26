package Constructors;


import java.time.LocalDate;
import java.time.LocalDate;
public class TrackOrderDetailsCons {
	int order_Id;
	String SupplierName;
	String place;
	LocalDate Date;
	//Constructor
	public TrackOrderDetailsCons(int order_Id, String supplierName, String place, LocalDate date) 
	{
		super();
		this.order_Id = order_Id;
		SupplierName = supplierName;
		this.place = place;
		this.Date = date;
	}
	//Getters and Setters
	public int getOrder_Id() 
	{
		return order_Id;
	}
	public void setOrder_Id(int order_Id) 
	{
		this.order_Id = order_Id;
	}
	public String getSupplierName() 
	{
		return SupplierName;
	}
	public void setSupplierName(String supplierName) 
	{
		SupplierName = supplierName;
	}
	public String getPlace() 
	{
		return place;
	}
	public void setPlace(String place) 
	{
		this.place = place;
	}
	public LocalDate getDate() 
	{
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
}
