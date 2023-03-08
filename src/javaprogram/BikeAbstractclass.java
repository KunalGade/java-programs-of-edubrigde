package javaprogram;
 abstract class Motorbike
 {
	 abstract void brake1();
	 void brake() {
		 System.out.println("brake method");
	 }
 }
 
 class Sportbike extends Motorbike
 {

	@Override
	void brake1() {
		System.out.println("sportbike break");
		// TODO Auto-generated method stub
		
	}
	 
 }

 class mountainbike extends Motorbike
 {

	@Override
	void brake1() {
		System.out.println("mountainbike break");
		// TODO Auto-generated method stub
		
	}
	 
 }
public class BikeAbstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 mountainbike m=new  mountainbike();
		 m.brake1();
		 Sportbike s=new Sportbike ();
		 s.brake1();
		
	}

	
}
