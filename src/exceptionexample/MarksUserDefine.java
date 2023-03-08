package exceptionexample;

import java.util.Scanner;

class MarksUserDefinedException extends Exception
{
	String s;
public MarksUserDefinedException(String s)
{
	this.s=s;
}

public String toString()
{
return s;
}
}

public class MarksUserDefine {
	void CheckedMark(int m) throws MarksUserDefinedException
	{
		if(m<0 ||m>100)
		{
			throw new MarksUserDefinedException("marks is blank");
		}
		else
		{
			System.out.println("valid marks");
		}
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 MarksUserDefine m=new  MarksUserDefine();
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter marks");
    	 int marks=sc.nextInt();
	try
	{
		m.CheckedMark(marks);
	}
	catch( MarksUserDefinedException e)
	{
		System.out.println(e);
	}

    }
}
