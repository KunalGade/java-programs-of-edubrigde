package threadop;

public class FinallizeDemo1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		FinallizeDemo1 fz=new FinallizeDemo1();
		fz=null;
		System.gc();
		System.out.println("main method");
	}
    @Override
    protected void finalize() throws Throwable {
    	// TODO Auto-generated method stub
    	super.finalize();
    	System.out.println("finallize method");
    }
}
