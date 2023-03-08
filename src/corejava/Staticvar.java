package corejava;
class Staticclass
{
	static int c;
	static void displayc()
	{
		System.out.println("value of c:"+c);
	}
}
public class Staticvar {
   static int a;
   static void display()
   {
	   System.out.println("value of a:"+a);
   }
   int b;
   void display1()
   {
	   System.out.println("value of b:"+b);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      a=10;
      display();
      Staticvar sc=new  Staticvar();
      sc.b=15;
      sc.display1();
      Staticclass.c=2;
      Staticclass.displayc();
	}
	

}
