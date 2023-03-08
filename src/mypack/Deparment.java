package mypack;
class shoe
{
	void show()
	{
		System.out.println("the shoes");
		
	}
}
class cloth extends shoe
{
	void show() {
		System.out.println("the cloths");
		super.show();
	}
}
class showroom extends cloth
{
	void show() {
		System.out.println("the showroom");
	}
}
public class Deparment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         shoe s=new shoe();
         showroom s1=new showroom();
         s.show();
         s1.show();
	}

}
