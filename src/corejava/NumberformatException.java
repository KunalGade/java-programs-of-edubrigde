package corejava;

public class NumberformatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try
     {
    	 String s="abc";
    	 int i=Integer.parseInt(s);
     }catch(Exception e)
     {
    	 System.out.println(e);
     }
	}

}
