package corejava;

public class NullpointerException {

	public static void main(String[] args) {
      // TODO Auto-generated method stub
     try
     {
    	 String s=null;
    	 System.out.println("Length"+s.length());
    	 
     }
     catch(Exception e)
     {
    	 System.out.println("null pointer"+e);
     }
	}

}
