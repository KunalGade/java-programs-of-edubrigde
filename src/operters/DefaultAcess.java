package operters;
class Defclass
{
	private int a=10;
	void display()
	{
		System.out.println("value of default: "+a);
	}
}


public class DefaultAcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Defclass def=new Defclass();
        		 def.display();
	}

}
