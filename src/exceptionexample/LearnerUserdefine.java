package exceptionexample;

import pack1.Learner;

class InvalidLnameException extends Exception
{
	public InvalidLnameException(String s) {
		super(s);
	}
}

public class LearnerUserdefine {

  void checkedName(String lname,String fname) throws InvalidLnameException
  {
	  if (lname.isEmpty() && fname.isEmpty())
	  {
		  throw new InvalidLnameException("lname and fname is blank");
		  
	  }
	  else if (lname.isEmpty())
	  {
		  throw new InvalidLnameException("lname is blank");
	  }
	  else if(fname.isEmpty())
	  {
		  throw new InvalidLnameException("fname is blank");
	  }
	  
  }
  public static void main(String[] args) {
    Learner l=new Learner();
      l.setfname(" ");
    l.setlname(" ");
    LearnerUserdefine l1=new LearnerUserdefine ();
    try
    {
    	l1.checkedName(l.getlname(), l.getfname());
    }
    catch( InvalidLnameException e)
    {
    	System.out.println("invalid lname and fname:"+e.getMessage());
    	System.out.println(e.toString());
    }
  
  }

}
