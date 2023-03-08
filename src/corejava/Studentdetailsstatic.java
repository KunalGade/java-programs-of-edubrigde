package corejava;

public class Studentdetailsstatic {
	int a;
	static int b;
	int rollno;
	String name;
	static String Course="java full Static";
	Studentdetailsstatic(int rn,String nm)
	{
		rollno=rn;
		name=nm;
		System.out.println("student roll number"+rollno+"\n Student name"+name+"\n Student course"+Studentdetailsstatic.Course+"\n ****");
		a++;
		b++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentdetailsstatic s=new Studentdetailsstatic(1,"swap");
		Studentdetailsstatic s1=new Studentdetailsstatic(2,"sahil");
		Studentdetailsstatic s2=new Studentdetailsstatic(3,"soham");
		System.out.println("object of instasnce counter"+s2.a);
		System.out.println("object of static counter"+s2.b);
	}

}
