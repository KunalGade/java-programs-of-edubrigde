package corejava;

public class ArrayindexoutofboundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try
  {
	  int a[]=new int[5];
	  a[10]=50;
	  
  }catch(Exception e)
  {
	  System.out.println(e);
  }
	}

}
