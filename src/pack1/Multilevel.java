package pack1;
class Grandfather{
	String gname;
	void displayg()
	{
		System.out.println("my grandfather name is:"+gname);
	}
}
class father extends Grandfather{
	String fname;
	void displayf()
	{
		System.out.println("my father name is:"+fname);
	}
}

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      father f=new father();
      f.fname="ganesh";
      f.gname="chandra";
      f.displayf();
      f.displayg();
	}

}