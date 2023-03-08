package threadop;

public class FinallizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s= new String("hello");
   s=null;
   System.gc();
   System.out.println("main method");
	}
    protected void finallize() throws Throwable {
		// TODO Auto-generated method stub
    System.out.println("finallize method");
	}
}
