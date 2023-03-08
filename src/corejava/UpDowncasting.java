package corejava;
abstract class Doctor
{
	String dname;
	public void showDoc()
	{
		System.out.println("parent class doctor");
	}
}
class Patient extends Doctor
{
	String pname;
	public void showPatient()
	{
		System.out.println("child class patient");
	}
}
public class UpDowncasting {
   public static void main(String args[])
   {
	   //Doctor d=new Patient();
	   //d.dname="ganesh";
	   //stem.out.println("doctor name"+d.dname);
	   //d.showDoc();
	  Doctor p=new Patient();
	  p.dname="dge";
	  System.out.println("doctor name"+p.dname);
	  p.showDoc();
	  Patient p1=(Patient)p;
	  p1.pname="suryanshi";
	  p1.dname="ganesh";
	  System.out.println("patient nane is"+p1.pname);
	  p1.showPatient();
	  p1.showDoc();
  }
}
