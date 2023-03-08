package coreJavaproject;

public class Bank {
	 private int Bid;
	 private String name;
	 private double Balance;
	 private String city;
	  public Bank(String n,int a,double amount,String c)
	  {
		  name=n;
		  Bid=a;
		  Balance=amount;
		  city=c;
		  
	  }
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double Balance) {
		this.Balance = Balance;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	 

}
