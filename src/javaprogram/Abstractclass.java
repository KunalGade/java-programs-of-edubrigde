package javaprogram;
abstract class product
{
  abstract void display();
  public void show() {
	  System.out.println("show method");
  }

}

public class Abstractclass extends product{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractclass ab=new Abstractclass();
		ab.display();
		ab.show();
	}

	@Override
	void display() 
	{
		System.out.println("Abstract display method");
		// TODO Auto-generated method stub
		
	}

}
